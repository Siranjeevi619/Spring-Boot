package com.example.mySpring;

import com.example.mySpring.developer.Developer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.mySpring", "com.device.computer"})
public class MySpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MySpringApplication.class, args);

		Developer dev = context.getBean(Developer.class);
		dev.setAge(25);
		dev.Code();
	}
}
