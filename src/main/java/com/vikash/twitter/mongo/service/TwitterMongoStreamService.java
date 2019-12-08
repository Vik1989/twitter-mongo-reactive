package com.vikash.twitter.mongo.service;

import com.vikash.twitter.mongo.model.Tweet;
import reactor.core.publisher.Flux;

public interface TwitterMongoStreamService<T> {
    Flux<Tweet> getTweetsFromDb();

    String streamTweets();
}
