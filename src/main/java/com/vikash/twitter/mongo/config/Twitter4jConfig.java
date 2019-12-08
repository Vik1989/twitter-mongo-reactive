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

        configurationBuilder.setOAuthAccessToken("1367546552-KGjRj5Y50oVrYUr2KkKQuO6QzlFFtEAXk71EHnT")
                .setOAuthAccessTokenSecret("8EBKV6RSzCshoKf7Jz78kdQAIn37LNCzbY55SgpIQimr5")
                .setOAuthConsumerKey("7Gyx5jDjfXcvqbkfrLPf2QfT1")
                .setOAuthConsumerSecret("KEHNo5qinYOPR718MTYqOdVtJRNzDdSOunsBHCJ5bsCIcTYxZT");

        twitter4j.conf.Configuration config = configurationBuilder.build();

        return config;
    }
}
