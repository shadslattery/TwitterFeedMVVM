package com.example.twitterfeedmvvm.model;

public class Person {
    private String name;
    private String idTag;
    private String tweet;
    private String time;
    private String image;


    public Person(String name, String idTag, String tweet, String time, String image) {
        this.name = name;
        this.idTag = idTag;
        this.tweet = tweet;
        this.time = time;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdTag() {
        return idTag;
    }

    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
