package com.ruoyi.quartz.test;

import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/3/9 22:22
 */

public class Member {
    private Integer code;
    private String name;
    private Integer age;
    private Date birth;
    public Member(Integer code, String name, Integer age, Date birth) {
        super();
        this.code = code;
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

}
