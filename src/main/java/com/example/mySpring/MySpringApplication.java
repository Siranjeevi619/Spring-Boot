package com.example.mySpring;

import com.resource.learn.Dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MySpringApplication {

	public static void main(String[] args) {

		ApplicationContext con=  SpringApplication.run(MySpringApplication.class, args);
		Dev dev = con.getBean(Dev.class);
		dev.build();
	}


}
