package cglib;

/**
 * --add-opens java.base/java.lang=cglib
 *
 * @author zhouxin
 * @date 2018/10/17
 */
public class CglibTest {

    public static void main(String[] args) {
        Person instance = (Person)new CglibProxy().getInstance(Person.class);
        instance.findLove();
//        System.out.println(instance);
    }
}
