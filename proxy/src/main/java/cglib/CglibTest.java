package cglib;

import java.io.IOException;

/**
 * --add-opens java.base/java.lang=cglib
 *java -classpath "%JAVA_HOME%/lib/sa-jdi.jar" sun.jvm.hotspot.HSDB
 * @author zhouxin
 * @date 2018/10/17
 */
public class CglibTest {

    public static void main(String[] args) {
        Person instance = (Person)new CglibProxy().getInstance(Person.class);
        instance.findLove();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\class");
//        System.out.println(instance);
    }
}
