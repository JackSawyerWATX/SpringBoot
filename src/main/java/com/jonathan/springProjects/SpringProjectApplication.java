package com.jonathan.springProjects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}
	@RestController@RequestMapping("/")
	public class HomeController{
@RequestMapping("")
	public String hello() {
		return "Hello, CRUEL WORLD!!";
	}
@RequestMapping("/world")
public String world() {
        return "Class level annotations are NIFTY too!";
		}
	}
}
