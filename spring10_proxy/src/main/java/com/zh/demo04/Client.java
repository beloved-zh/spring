package com.zh.demo04;

import com.zh.demo02.Userservice;
import com.zh.demo02.UserserviceImpl;

public class Client {

    public static void main(String[] args) {

        UserserviceImpl ser = new UserserviceImpl();

        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(ser);

        Userservice User = (Userservice) handler.getProx();


        User.delete();
    }

}
