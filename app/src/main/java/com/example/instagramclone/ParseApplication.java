package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("54ySNq2wC4WPp3gPH84mkgjwRBIrRXvAZg800Pal")
                .clientKey("MqXlaAiroXyhQj98A7tZCdN0YiY18BZql4NiU1KF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
