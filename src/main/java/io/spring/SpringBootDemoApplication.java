package io.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Configuration;

//@ComponentScan(basePackages = {"io.spring", "com.cuchuoi"})
@SpringBootApplication  //(exclude = DataSourceAutoConfiguration.class)
@Configuration
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);

	}

}