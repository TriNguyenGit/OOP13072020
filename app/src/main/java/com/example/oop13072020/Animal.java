package com.example.oop13072020;

import android.bluetooth.le.ScanSettings;
import android.util.Log;
import android.widget.Switch;

public class Animal {
   private String category;
   private int height;
   private int weight;
    public void eat(Food food){
        switch(food){
            case MEAT:
                Log.d("BBB","predator");
                break;
            case GRASS:
                Log.d("BBB","herbivore");
                break;
        }
        Log.d("BBB","");
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
