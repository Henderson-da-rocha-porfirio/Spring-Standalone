package com.tuyo;

import com.tuyo.service.DefaultHelloWorldService;
import com.tuyo.service.HelloWorldService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootStandaloneApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStandaloneApp.class, args);
	}

	@Bean
	public HelloWorldService getHelloWorldService() {
		return new DefaultHelloWorldService();
	}

	@Override
	public void run(String... args) throws Exception {
		getHelloWorldService().hello();
	}
}