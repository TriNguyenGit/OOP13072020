package com.example.oop13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Object : cá thể
        // Class : tập thể
        Animal  dog = new Animal();
        dog.category = "Động vật";
        dog.height = 50;
        dog.weight = 15;
        dog.eat(Food.MEAT);
        Dog kiki = new Dog();
        kiki.category = "Chó nhật";
        kiki.height = 50;
        kiki.weight = 15;
        kiki.setSpeed(15);
        kiki.eat(Food.MEAT);
    }
}