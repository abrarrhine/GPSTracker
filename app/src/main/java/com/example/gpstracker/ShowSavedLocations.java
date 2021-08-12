package com.example.gpstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowSavedLocations extends AppCompatActivity {

    ListView lv_SavedLocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_saved_locations);
        lv_SavedLocations = findViewById(R.id.lv_wayPoint);
        GlobalList globalList= (GlobalList)getApplicationContext();
        List<Location> savedLocations = globalList.getMyLocation();

        lv_SavedLocations.setAdapter(new ArrayAdapter<Location>(this, android.R.layout.simple_list_item_1,savedLocations));

    }
}