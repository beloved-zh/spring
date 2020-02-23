package com.zh.demo03;

import com.zh.demo03.ProxyInvocationHandler;

public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色  现在没有
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        //调用程序处理角色来调用要调用的接口对象
        handler.setRent(host);

        //动态生成的
        Rent rent = (Rent) handler.getProx();

        rent.rent();
    }

}
