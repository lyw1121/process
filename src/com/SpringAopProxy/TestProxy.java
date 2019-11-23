package com.SpringAopProxy;

import org.junit.Test;

/**
 * @author wangyl
 * @date 2019/4/8 10:19
 */
public class TestProxy {

    //测试demo
    @Test
    public void study(){
        Service service = new ServiceImpl("xxx");        //创建一个目标对象
        ServiceProxyFactory proxyFactory = new ServiceProxyFactory(service);     //创建一个代理对象
        Service serviceProxy = proxyFactory.getServiceProxy();            //调用创建代理对象方法
        //serviceProxy.save();                     //调用目标对象中的业务方法
        serviceProxy.update("333");
    }
}
