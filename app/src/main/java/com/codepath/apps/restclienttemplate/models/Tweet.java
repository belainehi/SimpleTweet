package com.codepath.apps.restclienttemplate.models;

import org.json.JSONObject;

public class Tweet {
    public String body;
    public String created_at;
    public User user;

    public static Tweet fromJson(JSONObject jsonObject){
        Tweet tweet = new Tweet();
        tweet.body = jsonObject.getString("text");
        tweet.created_at=jsonObject.getString("created_at");
        tweet.user=User.fromJson(jsonObject.getJSONObject("user"));
        return tweet;
    }
}
