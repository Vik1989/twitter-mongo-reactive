package com.vikash.twitter.mongo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.vikash")

public class TwitterMongoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TwitterMongoApplication.class, args);
	}

}
