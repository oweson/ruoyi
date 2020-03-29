package com.ruoyi.web.controller.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/25 9:35
 */
@Configuration
public class BigCat {
    @Bean
    @Scope("singleton")
    Cat cat(){
        return new Cat();
    }
}
