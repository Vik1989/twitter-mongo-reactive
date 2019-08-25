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

        configurationBuilder.setOAuthAccessToken("1367546552-zo6T1I7jfU0wmuQQcL3zvuWkr7RKKKSl3mvt0ma")
                .setOAuthAccessTokenSecret("05cEELivOoAWNnaZm5KI97hrD4NCuklLGLq5qjEmaiqGa")
                .setOAuthConsumerKey("Amp5AWrQF2gETaEj5y5DQf614")
                .setOAuthConsumerSecret("8Od8df4vbypYqcqYxheVSygWwQt31VSNcMFaqPlJCsqcUVbtzo");

        twitter4j.conf.Configuration config = configurationBuilder.build();

        return config;
    }
}
