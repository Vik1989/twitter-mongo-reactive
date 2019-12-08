package com.vikash.twitter.mongo.model;

import org.springframework.data.annotation.Id;

public class Tweet {

    @Id
    private Integer id;
    private String tweet;

    public Tweet(Integer id, String tweet) {
        this.id = id;
        this.tweet = tweet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id='" + id + '\'' +
                ", tweet='" + tweet + '\'' +
                '}';
    }
}
