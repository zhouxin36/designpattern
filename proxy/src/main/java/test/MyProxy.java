package test;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyProxy {

    public static final String ln = "\r\n";

    public static Object getProxyInstance(MyClassLoader myClassLoader, Class<?>[] interfaces, MyInvocationHandler myInvocationHandler) throws Exception{
        String source = getSource(interfaces);
        File file = new File(MyProxy.class.getResource("").getPath() + "$Proxy0.java");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(source);
        fileWriter.flush();
        fileWriter.close();

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
        Iterable iterable = manage.getJavaFileObjects(file);

        JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
        task.call();
        manage.close();

        Class<?> clazz = myClassLoader.findClass("$Proxy0");
        Constructor<?> constructor = clazz.getConstructor(MyInvocationHandler.class);
        return constructor.newInstance(myInvocationHandler);
    }

    private static String getSource(Class<?>[] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package test;" + ln);
        sb.append("import test.Human;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);

        sb.append("MyInvocationHandler h;" + ln);

        sb.append("public $Proxy0(MyInvocationHandler h) { " + ln);

        sb.append("this.h = h;");

        sb.append("}" + ln);


        for (Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
            sb.append("return ("+m.getReturnType().getName()+")this.h.invoke(this,m,null);" + ln);
            sb.append("}catch(Throwable e){" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("return null;" + ln);
            sb.append("}");
            sb.append("}");
        }

        sb.append("}" + ln);

        return sb.toString();
    }
}
