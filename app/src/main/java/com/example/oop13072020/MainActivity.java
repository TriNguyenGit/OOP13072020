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
        //Animal  dog = new Animal();
        //dog.setCategory("Động vật");
        //dog.setHeight(50);
        //dog.setWeight(15);
        //dog.eat(Food.MEAT);
        //Dog kiki = new Dog();
        //kiki.setCategory("Chó nhật");
        //kiki.setHeight(50);
        //kiki.setWeight(15);
        //kiki.setSpeed(15);
        //kiki.eat(Food.MEAT);
        Dog kiki = new Dog("Chó việt nam",50,3,5,"Nâu");
        //@Override : ghi đè
            // + ngữ cảnh khi sử dụng kế thừa
            // + Cách nhận biết :
                // - có annotation : @Override
                // - phương thức có lớp cha định nghĩa và lớp con thay đổi
        //@OverLoad : Nạp chồng



    }
}