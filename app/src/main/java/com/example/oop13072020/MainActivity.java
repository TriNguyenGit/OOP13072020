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

        // tạo ra một cá thể từ tập thể SinhVien
        SinhVien sinhViena = new SinhVien();
        sinhViena.setTen("Nguyen Van A");
        Log.d("BBB",sinhViena.getTen());
    }
}