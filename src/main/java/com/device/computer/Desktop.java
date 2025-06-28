package com.device.computer;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Override
    public void doCode() {
        System.out.println("Come complete the code with Desktop");
    }
}

