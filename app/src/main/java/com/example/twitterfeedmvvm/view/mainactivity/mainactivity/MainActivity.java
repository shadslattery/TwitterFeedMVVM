package com.example.twitterfeedmvvm.view.mainactivity.mainactivity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.twitterfeedmvvm.R;
import com.example.twitterfeedmvvm.repository.Repository;
import com.example.twitterfeedmvvm.view.mainactivity.adapter.PersonAdapter;

public class MainActivity extends AppCompatActivity {

        private RecyclerView rvPeople;
        private PersonAdapter staffAdapter;

        @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPeople = findViewById(R.id.rv_person);

        // Finish setting up recycleview
            rvPeople.setLayoutManager(new LinearLayoutManager(this));
            rvPeople.setHasFixedSize(true);

        // Init Person Adapter
            staffAdapter = new PersonAdapter(Repository.getInstance().getData());
            rvPeople.setAdapter(staffAdapter);
    }

    }

