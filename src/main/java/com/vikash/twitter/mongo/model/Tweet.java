package com.vikash.twitter.mongo.model;

import org.springframework.data.annotation.Id;

public class Tweet {

    @Id
    private String id;
    private String tweet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }
}
