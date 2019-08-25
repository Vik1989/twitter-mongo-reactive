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

        configurationBuilder.setOAuthAccessToken("Your access token")
                .setOAuthAccessTokenSecret("your access token secret ")
                .setOAuthConsumerKey("your consumer key")
                .setOAuthConsumerSecret(" your consumer secret");

        twitter4j.conf.Configuration config = configurationBuilder.build();

        return config;
    }
}
