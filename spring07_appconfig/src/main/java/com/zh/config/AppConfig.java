package com.zh.config;

import com.zh.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//这个也会被spring容器托管，注册到容器中，因为它本来就是一个@Component
//@Configuration代表这是一个配置类，和applicationContext.xml是一样的
@Configuration
//扫描包
@ComponentScan("com.zh.pojo")
//整合配置类
@Import(MyConfig.class)
public class AppConfig {

    /*
     * 相当于一个<bean>标签
     * 方法名相当于bean标签的id
     * 返回值相当于bean的class
     *
     * 扫描包之后可以不写这个方法
     */
    @Bean
    public User user(){
        return new User();//就是返回要注入到bean的对象
    }

}
