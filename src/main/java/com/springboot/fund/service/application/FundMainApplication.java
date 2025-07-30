package com.springboot.fund.service.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.springboot")
@EnableJpaRepositories(basePackages = "com.springboot.fund.repository")
@EntityScan(basePackages = "com.springboot.fund.entity")
public class FundMainApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(FundMainApplication.class, args);
	}
}
