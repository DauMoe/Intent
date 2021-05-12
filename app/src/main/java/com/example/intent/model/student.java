package com.example.intent.model;

import java.io.Serializable;

public class student implements Serializable {
    private int imgSrc;
    private String name;
    private int age;

    public student(int imgSrc, String name, int age) {
        this.imgSrc = imgSrc;
        this.name = name;
        this.age = age;
    }

    public student(int img1) {};

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
