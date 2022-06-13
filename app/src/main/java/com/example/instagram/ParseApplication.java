package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

//        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VHrZl9ad7FXyoM2jPNWwzVEAGQKCdZFtv5D95PeD")
                .clientKey("m8caaBgzVpqelBwNd1MNqWe5zEwDxtGbv0H4WWOk")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
