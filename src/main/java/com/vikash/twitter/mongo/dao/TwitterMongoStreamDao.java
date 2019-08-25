package com.vikash.twitter.mongo.dao;

import com.vikash.twitter.mongo.model.Tweet;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TwitterMongoStreamDao extends ReactiveCrudRepository<Tweet, String> {
}
