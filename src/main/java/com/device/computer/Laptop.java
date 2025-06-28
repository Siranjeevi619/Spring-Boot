package com.device.computer;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void doCode() {
        System.out.println("Code is running on Laptop");
    }
}
