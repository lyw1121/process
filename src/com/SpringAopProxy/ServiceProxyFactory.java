package com.SpringAopProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wangyl
 * @date 2019/4/8 9:56
 */
public class ServiceProxyFactory implements InvocationHandler {
    /**
     * 此demo是springAop底层的动态代理的实现
     * jdk动态代理方法必须的条件：目标对象要实现相应的接口
     */
    private Service ser;

    //带参构造器 ,将目标对象传入
    public ServiceProxyFactory(Service ser){
        this.ser = ser;
    }

    //创建代理对象
    public Service getServiceProxy() {
        Service serviceProxy = (Service) Proxy.newProxyInstance(ServiceProxyFactory.class.getClassLoader(),    //代理类加载器
                                                               ServiceImpl.class.getInterfaces(),             //获取接口
                                                               this);                                      //即代理类实现的InvocationHandel接口
        return serviceProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        ServiceImpl ss =(ServiceImpl) this.ser;
        Object invoke = null;
        if(ss.getUser()!=null){
            System.out.println("打开事务");
            invoke = method.invoke(ser, args);                  //当客户端调用代理类时，invocationhandle类会调用invoke方法去目标对象中调用目标方法
            System.out.println("提交事务");

        }
        return invoke;

    }
}
