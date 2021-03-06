package dynamicproxy;

import dynamicproxy.demo.Person;
import dynamicproxy.demo.StuInvocationHandler;
import dynamicproxy.demo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class Test1 {

    private final static Logger logger = LoggerFactory.getLogger(Test1.class);

    public static void main(String[] args) {
//        Person zhangsan = new Student("张三");

        InvocationHandler stuHandler = new StuInvocationHandler<>(Person.class);

        Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, stuHandler);

        User user = stuProxy.giveMoney();

        logger.info("user:{}",user);

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

    }
}
