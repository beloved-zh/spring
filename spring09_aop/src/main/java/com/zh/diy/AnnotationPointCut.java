package com.zh.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 方式三：使用注解实现AOP
 */
//标注这个类是一个切面
@Aspect
public class AnnotationPointCut {

    @Before("execution(* com.zh.service.UserServiceImpl.*(..))")
    public void befare(){
        System.out.println("============方法执行前============");
    }

    @After("execution(* com.zh.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("============方法执行后============");
    }


    /**
     * 环绕增强
     */
    @Around("execution(* com.zh.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {

        System.out.println("环绕前");

        //获得方法签名
        Signature signature = jp.getSignature();
        System.out.println("signature:"+signature);

        //执行方法
        Object proceed = jp.proceed();

        System.out.println("环绕后");

        System.out.println(proceed);

    }


}
