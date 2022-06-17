package com.example.instagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;

@ParseClassName("User")
public class User extends ParseObject {

    public static final String KEY_PFP = "profileImage";

    public User() {
    }

    public ParseFile getProfileImage() {
        return getParseFile(KEY_PFP);
    }
}
