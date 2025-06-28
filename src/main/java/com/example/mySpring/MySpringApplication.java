package com.example.mySpring;

import com.example.mySpring.dependencyInjection.Developer;
import com.resource.learn.Dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.mySpring", "com.resource.learn"})

public class MySpringApplication {

	public static void main(String[] args) {

		ApplicationContext con=  SpringApplication.run(MySpringApplication.class, args);
//		Dev dev = con.getBean(.class);
//		dev.build();
		Developer dev = con.getBean(Developer.class);
		dev.Code();
	}


}
