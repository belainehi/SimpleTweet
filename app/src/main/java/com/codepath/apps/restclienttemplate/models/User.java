package com.codepath.apps.restclienttemplate.models;

import org.json.JSONObject;

public class User {
    public String name;
    public String handle;
    public String public_image_url;
    public static User fromJson(JSONObject jsonObject){
        User user = new User();
        user.name = jsonObject.getString("name");
        user.handle= jsonObject.getString("screen_name");
        user.public_image_url=json
        return user;
    }
}
