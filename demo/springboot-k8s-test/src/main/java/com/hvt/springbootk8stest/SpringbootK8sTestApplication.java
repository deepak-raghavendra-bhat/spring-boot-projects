package com.hvt.springbootk8stest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sTestApplication.class, args);
	}

}
