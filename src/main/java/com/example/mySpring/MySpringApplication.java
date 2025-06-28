package com.example.mySpring;

import com.example.mySpring.developer.Developer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.mySpring","com.device.computer", "com.resource.learn"})

public class MySpringApplication {

	public static void main(String[] args) {

//		ApplicationContext con=  SpringApplication.run(MySpringApplication.class, args);
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");

//		Dev dev = con.getBean(.class);
//		dev.build();
		Developer dev = (Developer) con.getBean("dev");
//		dev.Code();
//		dev.age = 19;
		System.out.println(dev.name);
	}


}
