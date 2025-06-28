package com.example.mySpring.developer;

import com.device.computer.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {

    @Autowired
    private Computer comp;

    private int age;
    public String name = "Dev";

    public void Code() {
        comp.doCode();
        System.out.println("Developer age: " + age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
