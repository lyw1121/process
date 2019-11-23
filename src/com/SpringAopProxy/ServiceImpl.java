package com.SpringAopProxy;


/**
 * @author wangyl
 * @date 2019/4/8 9:58
 */
public class ServiceImpl implements Service {

    private String user = null;
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public ServiceImpl(){

    }
    public ServiceImpl(String user){
        this.user = user;
    }

    @Override
    public void save( String user) {
        System.out.println("这是保存操作！！！");
    }

    @Override
    public void update( String user) {
        System.out.println("这是更新操作！！！");
    }
}
