package com.example.task51ctourismapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DestinationFragment extends Fragment {

    View view;
    ImageView image;
    TextView header, desc;
    String imageStr;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_destination, container, false);

        //Assigning fragment layout views to local variables.
        image = view.findViewById(R.id.destinationImageView);
        header = view.findViewById(R.id.headingTextView);
        desc = view.findViewById(R.id.descTextView);

        if(getArguments()!=null){
            imageStr = getArguments().getString("image");
            image.setImageResource(view.getResources().getIdentifier("drawable/" + imageStr, null, getActivity().getApplicationContext().getPackageName()));

            header.setText(getArguments().getString("header"));
            header.setText(getArguments().getString("desc"));
        }

        return view;
    }
}