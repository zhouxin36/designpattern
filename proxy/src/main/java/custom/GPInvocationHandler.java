package custom;

import java.lang.reflect.Method;

/**
 * @author zhouxin
 * @date 2018/10/17
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
