package com.zh.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//说明这个类被spring容器接管了，注册到了ioc容器中
@Component
public class User {

    //属性注入值
    @Value("张三")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
