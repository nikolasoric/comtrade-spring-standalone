package com.comtrade.standalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ComtradeSpringStandaloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComtradeSpringStandaloneApplication.class, args);
	}

}
