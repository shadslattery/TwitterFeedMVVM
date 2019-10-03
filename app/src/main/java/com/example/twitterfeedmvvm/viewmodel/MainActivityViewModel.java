package com.example.twitterfeedmvvm.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.twitterfeedmvvm.model.Person;
import com.example.twitterfeedmvvm.repository.Repository;

import java.util.List;
import android.app.Application;



public class MainActivityViewModel extends AndroidViewModel {

    private Repository repo;

        public MainActivityViewModel(@NonNull Application application) {
        super(application);
        repo = Repository.getInstance();
    }

    // Method to getData (List<Person>)
    public List<Person> getData(){
            return repo.getData();}

        }