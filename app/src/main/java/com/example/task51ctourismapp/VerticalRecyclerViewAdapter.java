package com.example.task51ctourismapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VerticalRecyclerViewAdapter extends RecyclerView.Adapter<VerticalRecyclerViewAdapter.ViewHolder> {

    private List<Destination> destinationList;
    private Context context;

    @NonNull
    @Override
    public VerticalRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.destination_vertical, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalRecyclerViewAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView destinationImage;
        TextView destinationHeader, destinationDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //Assigning views from itemView(destination_vertical.xml) to local variables.
            destinationImage = itemView.findViewById(R.id.cardImageView);
            destinationHeader = itemView.findViewById(R.id.HeaderTextView);
            destinationDesc = itemView.findViewById(R.id.descTextView);
        }
    }
}
