package com.example.esenbekova_nigora_hw33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.esenbekova_nigora_hw33.databinding.ActivityMainBinding;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private java.util.ArrayList<String> Furnitureist;
    private ArrayList<String> furnitureList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        FurnitureAdapter adapter = new FurnitureAdapter(furnitureList);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        furnitureList.add("chair");
        furnitureList.add("sofa");
        furnitureList.add("arm_chair");
        furnitureList.add("bed_room");
        furnitureList.add("cabinet");

    }
}
