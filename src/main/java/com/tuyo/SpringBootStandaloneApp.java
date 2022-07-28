package com.tuyo;

import com.tuyo.service.DefaultHelloService;
import com.tuyo.service.HelloService;
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
	public HelloService getHelloService() {
		return new DefaultHelloService();
	}

	@Override
	public void run(String... args) throws Exception {
		getHelloService().hello();
	}
}