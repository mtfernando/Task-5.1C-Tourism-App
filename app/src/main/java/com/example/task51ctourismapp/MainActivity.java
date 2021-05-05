package com.example.task51ctourismapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static String PACKAGE_NAME;
    RecyclerView verticalRecyclerView, horizontalRecyclerView;
    VerticalRecyclerViewAdapter verticalRecyclerViewAdapter;
    HorizontalRecyclerViewAdapter horizontalRecyclerViewAdapter;
    List<Destination> destinationList = new ArrayList<>();

    String[] destinationNameList;
    String[] destinationDescriptionList;
    String[] imageResStringList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PACKAGE_NAME = getApplicationContext().getPackageName();

        destinationNameList = getResources().getStringArray(R.array.destinationNameList);
        destinationDescriptionList = getResources().getStringArray(R.array.destinationDescriptionList);
        imageResStringList= getResources().getStringArray(R.array.imageResStringList);

        for(int i=0; i<destinationNameList.length; i++){
            Destination destination = new Destination(imageResStringList[i], destinationNameList[i], destinationDescriptionList[i]);
            destinationList.add(destination);
            System.out.println(destination.getHeader().toString());
        };

        //Setting up the Horizontal RecyclerView
        horizontalRecyclerView = findViewById(R.id.horizontalRecyclerView);
        horizontalRecyclerViewAdapter = new HorizontalRecyclerViewAdapter(destinationList, this);
        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        horizontalRecyclerView.setAdapter(horizontalRecyclerViewAdapter);

        //setting up the Vertical RecyclerView
        verticalRecyclerView = findViewById(R.id.verticalRecyclerView);
        verticalRecyclerViewAdapter = new VerticalRecyclerViewAdapter(destinationList,this);
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        verticalRecyclerView.setAdapter(verticalRecyclerViewAdapter);
    }
}