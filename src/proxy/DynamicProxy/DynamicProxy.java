package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类，每个动态代理类都必须实现InvocationHandler接口
 *
 */
public class DynamicProxy implements InvocationHandler {


    private Object subject;

    public DynamicProxy(Object subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(subject, args);
        
        return null;
    }
}
