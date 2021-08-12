package com.example.gpstracker;
import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class GlobalList extends Application{

    private static GlobalList singleton;
    private List<Location> myLocations;

    public void setMyLocation(List<Location> myLocations){
        this.myLocations = myLocations;
    }

    public List<Location> getMyLocation(){
        return myLocations;
    }
    public GlobalList getInstance(){
        return singleton;
    }

    public void onCreate(){
        super.onCreate();
        singleton=this;
        myLocations= new ArrayList<>();

    }
}
