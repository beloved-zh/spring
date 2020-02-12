package com.zh.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.zh.model.User"/>
@Component
//作用域
@Scope("singleton")
public class User {

    //相当于 <property name="name" value="李四"/>
    @Value("李四")
    public String name;

}
