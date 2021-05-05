package com.example.task51ctourismapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MainFragment extends Fragment {
    View view;
    RecyclerView verticalRecyclerView, horizontalRecyclerView;
    VerticalRecyclerViewAdapter verticalRecyclerViewAdapter;
    HorizontalRecyclerViewAdapter horizontalRecyclerViewAdapter;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_main, container, false);
        for(int i=0; i<destinationNameList.length; i++){
            Destination destination = new Destination(imageResStringList[i], destinationNameList[i], destinationDescriptionList[i]);
            destinationList.add(destination);
            System.out.println(destination.getHeader().toString());
        };

        //Setting up the Horizontal RecyclerView
        horizontalRecyclerView = view.findViewById(R.id.horizontalRecyclerView);
        horizontalRecyclerViewAdapter = new HorizontalRecyclerViewAdapter(destinationList, getActivity());
        horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        horizontalRecyclerView.setAdapter(horizontalRecyclerViewAdapter);

        //setting up the Vertical RecyclerView
        verticalRecyclerView = view.findViewById(R.id.verticalRecyclerView);
        verticalRecyclerViewAdapter = new VerticalRecyclerViewAdapter(destinationList,getActivity());
        verticalRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        verticalRecyclerView.setAdapter(verticalRecyclerViewAdapter);
        return view;
    }
}