package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CheckAccount implements MyInvocationHandler{

    public Human human;

    public Human getInstance(Class<?> clazz)throws Exception{
        human = (Human)clazz.getConstructor().newInstance();
        return (Human) MyProxy.getProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("查询前");
        Object invoke = method.invoke(human,args);
        System.out.println("查询后");
        return invoke;
    }
}
