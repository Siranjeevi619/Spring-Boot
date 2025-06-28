package com.example.mySpring.developer;

import com.device.computer.Computer;

public class Developer {
    private Computer comp;
    public int age;
    public String name;

    public Developer(String name) {
        this.name = name;
        System.out.println("name constructor called");
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Code() {
        comp.doCode();
        System.out.println("Developer age: " + age);
    }
}
