package com.vikash.twitter.mongo.service;

import com.vikash.twitter.mongo.dao.TwitterMongoStreamDao;
import com.vikash.twitter.mongo.model.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class TwitterMongoStreamServiceImpl implements TwitterMongoStreamService {

    @Autowired
    private TwitterMongoStreamDao twitterMongoStreamDao;


    public Flux<Tweet> getTweetsFromDb() {

        Flux<Tweet> tweet = twitterMongoStreamDao.findAll();

        return tweet;

    }

    @Override
    public String streamTweets() {

        

        return null;
    }
}
