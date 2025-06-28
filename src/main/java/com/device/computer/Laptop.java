package com.device.computer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class Laptop implements Computer {

    @Override
    public void doCode() {
        System.out.println("Come complete the code with laptop");
    }
}
