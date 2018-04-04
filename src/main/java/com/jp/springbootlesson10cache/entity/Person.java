package com.jp.springbootlesson10cache.entity;

import java.io.Serializable;

/**
 * Created by 张俊鹏 on 4/4/2018
 */
public class Person implements Serializable {

    private String id;

    private String name;

    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
