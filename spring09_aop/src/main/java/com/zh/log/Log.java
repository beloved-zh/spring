package com.zh.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 前置通知MethodBeforeAdvice
 */
public class Log implements MethodBeforeAdvice {

    /*
     *
     *  method      要执行的目标对象的方法
     *  objects     参数
     *  o           目标对象
     *
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"对象的"+method.getName()+"的方法被执行了");
    }
}
