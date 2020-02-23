package com.zh.demo02;

public class Client {

    public static void main(String[] args) {
        UserserviceImpl ser = new UserserviceImpl();

        UserserviceProxy proxy = new UserserviceProxy();
        proxy.setSer(ser);

        proxy.add();
    }

}
