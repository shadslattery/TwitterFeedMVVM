package com.example.twitterfeedmvvm.repository;

import com.example.twitterfeedmvvm.model.Person;
import java.util.ArrayList;
import java.util.List;


public class Repository {
    // Step 1: Private Constructor
    private Repository() {
    }

    // Step 2: static class to hold Instance
    static class InstanceHolder {

        // Step 3: create INSTANCE of object or class
        static Repository INSTANCE = new Repository();
    }

    // Step 4: public static method to get the instance
    public static Repository getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public List<Person> getData() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Michael", "Jordan", "mj23@bulls.com", "1:50p", ""));
        people.add(new Person("Tiger", "Woods", "twoods@golf.com", "5:15p", ""));
        return people;
    }
}
