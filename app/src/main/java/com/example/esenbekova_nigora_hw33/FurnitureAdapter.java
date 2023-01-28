package com.example.esenbekova_nigora_hw33;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FurnitureAdapter extends RecyclerView.Adapter<FurnitureViewHolder> {

    private ArrayList<String> furnitureList;

    public FurnitureAdapter(ArrayList<String> furnitureList) {
        this.furnitureList = furnitureList;
    }

    @NonNull
    @Override
    public FurnitureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FurnitureViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_furniture,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FurnitureViewHolder holder, int position) {
        holder.bind(furnitureList.get(position));
    }

    @Override
    public int getItemCount() {
        return furnitureList.size();
    }
}
