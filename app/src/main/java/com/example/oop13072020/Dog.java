package com.example.oop13072020;

import android.util.Log;

public class Dog extends Animal {
    String backgroundcolor;
    int speed;
    public  void  setSpeed(int speed){
        this.speed = speed ;
    }

    // primary constructor
    public Dog( String category, int height, int weight){
        super(category,height,weight);
    }
    //secondary constructor
    public Dog( String category, int height, int weight,int speed, String backgroundcolor){
        super(category,height,weight);
        this.speed = speed;
        this.backgroundcolor = backgroundcolor;
    }

    @Override
    public void eat(Food food) {
        switch(food){
            case MEAT:
                Log.d("BBB","Lòai ăn thịt");
                break;
            case GRASS:
                Log.d("BBB","Loài ăn cỏ");
                break;
        }
    };


}
