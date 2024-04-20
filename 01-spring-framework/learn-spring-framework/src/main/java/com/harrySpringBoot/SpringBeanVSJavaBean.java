package com.harrySpringBoot;

import java.io.Serializable;

class Pojo { // plane old java object
    private String text;
    private int number;

    public String toString() {
        return text + ":" + number;
    }

   
}

class JavaBean implements Serializable {

    // 3 - impelement serializable interface

    // 1 - public no-arg constructo
    public JavaBean() {
        
    }

    private String text;
    private int number;

    // 2 - getter and setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}

public class SpringBeanVSJavaBean {

    public static void main(String[] args) {
        
    }

}
