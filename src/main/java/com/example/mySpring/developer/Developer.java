package com.example.mySpring.developer;

import com.device.computer.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    @Autowired
    private Computer comp;

    public void Code() {
        comp.doCode();
        System.out.println("Come complete the code");
    }
}
