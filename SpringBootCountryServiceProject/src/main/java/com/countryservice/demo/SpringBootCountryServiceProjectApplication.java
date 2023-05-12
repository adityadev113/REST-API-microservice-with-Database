package com.countryservice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.countryservice.demo.repositories")
public class SpringBootCountryServiceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCountryServiceProjectApplication.class, args);
	}

}
