package test;

import java.io.*;

public class MyClassLoader extends ClassLoader{

    public static final String PARENTS_PATH = MyClassLoader.class.getResource("").getPath();

    @Override
    protected Class<?> findClass(String name) {

        String className = MyClassLoader.class.getPackage().getName() + "." + name;
        File file = new File(PARENTS_PATH + "\\" + name + ".class");
        if(file.exists()){
            try (FileInputStream fileInputStream = new FileInputStream(file);ByteArrayOutputStream bos = new ByteArrayOutputStream()){
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fileInputStream.read(bytes)) != -1){
                    bos.write(bytes,0,len);
                }
                return defineClass(className,bos.toByteArray(),0,bos.size());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
