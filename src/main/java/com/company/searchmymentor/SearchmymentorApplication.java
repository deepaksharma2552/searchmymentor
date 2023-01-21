package com.company.searchmymentor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.company")
public class SearchmymentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchmymentorApplication.class, args);
	}

}
