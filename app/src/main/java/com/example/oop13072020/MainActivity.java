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
        sinhViena.Ten = "Nguyen Van A";
        sinhViena.Tuoi = 15;
        sinhViena.Diachi = "TP HCM";
        Log.d("BBB",sinhViena.Ten);
    }
}