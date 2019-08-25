package com.vikash.twitter.mongo.controller;

import com.vikash.twitter.mongo.service.TwitterMongoStreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/twitter")
public class TwitterMongoController {

    @Autowired
    private TwitterMongoStreamService twitterMongoStreamService;

    @RequestMapping("/getTweets")
    @GetMapping
    public String getTweetsFromDb(@RequestParam("userName") String userName){

        twitterMongoStreamService.getTweetsFromDb();
        return "";
    }

    @RequestMapping("/getTweetsFromTwitter")
    @GetMapping
    public String getTweetsFromTwitter(@RequestParam("userName") String userName){


        return "";
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
