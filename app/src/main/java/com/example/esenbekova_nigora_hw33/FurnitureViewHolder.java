package com.example.esenbekova_nigora_hw33;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FurnitureViewHolder extends RecyclerView.ViewHolder {


    private TextView tv_Furniture;


    public FurnitureViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_Furniture = itemView.findViewById(androidx.core.R.id.text);

    }

    public void bind(String name) {
        tv_Furniture.setText(name);
    }
}
