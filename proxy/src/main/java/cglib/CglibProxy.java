package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhouxin
 * @date 2018/10/17
 */
public class CglibProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz){
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        //业务
        System.out.println("前");
        Object o = proxy.invokeSuper(obj,args);
        System.out.println("后");

        return null;
    }
}
