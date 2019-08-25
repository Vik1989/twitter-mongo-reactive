package com.vikash.twitter.mongo.service;

import reactor.core.publisher.Flux;

public interface TwitterMongoStreamService<T> {
    Flux<T> getTweetsFromDb();
}
