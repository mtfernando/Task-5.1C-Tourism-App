package com.example.task51ctourismapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView verticalRecyclerView;
    VerticalRecyclerViewAdapter verticalRecyclerViewAdapter;
    List<Destination> destinationList = new ArrayList<>();

    String[] destinationNameList = {"Melbourne","Brisbane","Tokyo","London", "Colombo", "New York"};
    String[] destinationDescriptionList = {
            "Visit Melbourne now!",
            "Visit Brisbane now!",
            "Visit Tokyo now!",
            "Visit London now!",
            "Visit Colombo now!",
            "Visit New York now!"
    };
    String[] imageResStringList = {
            "melbourne",
            "brisbane",
            "tokyo",
            "london",
            "colombo",
            "newyork"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0; i<destinationNameList.length; i++){
            Destination destination = new Destination(imageResStringList[i], destinationNameList[i], destinationDescriptionList[i]);
            destinationList.add(destination);
            System.out.println(destination.getHeader().toString());
        };

        verticalRecyclerView = findViewById(R.id.verticalRecyclerView);
        verticalRecyclerViewAdapter = new VerticalRecyclerViewAdapter(destinationList,this);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        verticalRecyclerView.setAdapter(verticalRecyclerViewAdapter);
    }
}