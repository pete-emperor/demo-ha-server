package com.pyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DemoServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceHiApplication.class, args);
	}


	@RequestMapping("/hi")
	public String hi(@RequestParam String name){
		return "hi im " + name;
	}

}
