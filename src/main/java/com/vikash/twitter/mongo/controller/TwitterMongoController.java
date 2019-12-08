package com.vikash.twitter.mongo.controller;

import com.vikash.twitter.mongo.model.Tweet;
import com.vikash.twitter.mongo.service.TwitterMongoStreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.Map;

@RestController
@RequestMapping("/twitter")
public class TwitterMongoController {

    @Autowired
    private TwitterMongoStreamService twitterMongoStreamService;

    @RequestMapping("/getTweets")
    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tweet> getTweetsFromDb(@RequestParam(value = "userName",required = false) String userName){

       return twitterMongoStreamService.getTweetsFromDb();

    }

    @RequestMapping(value = "/streamTweets", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @GetMapping
    public String getTweetsFromTwitter(@RequestParam("userName") String userName){

        return twitterMongoStreamService.streamTweets();
    }

    @RequestMapping("/saveTweets")
    @PostMapping
    public <T,V> String saveTweets(@RequestParam("userName") String userName, @RequestBody Map<T,V> requestMap){


        return "";
    }

    @RequestMapping("/sendTweets")
    @PostMapping
    public <T,V> String sendTweets(@RequestParam("userName") String userName, @RequestBody Map<T,V> requestMap){


        return "";
    }
}
