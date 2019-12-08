package com.vikash.twitter.mongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import twitter4j.conf.ConfigurationBuilder;

@Configuration
@EnableReactiveMongoRepositories
public class Twitter4jConfig {


    @Bean("configBuilder")
    public twitter4j.conf.Configuration getConfig(){

        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();

        //add mongo config here

        twitter4j.conf.Configuration config = configurationBuilder.build();

        return config;
    }
}
