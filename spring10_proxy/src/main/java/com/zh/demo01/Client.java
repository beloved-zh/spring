package com.zh.demo01;

public class Client {

    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理   代理角色会做一些附属操作
        Proxy proxy = new Proxy(host);
        //直接找中介即可
        proxy.rent();

    }

}
