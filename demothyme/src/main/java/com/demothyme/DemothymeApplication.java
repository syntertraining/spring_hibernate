package com.demothyme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

@Configuration
@ComponentScan
@EnableAsync
@EnableScheduling
@EnableAutoConfiguration
public class DemothymeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemothymeApplication.class, args);
	}
}
