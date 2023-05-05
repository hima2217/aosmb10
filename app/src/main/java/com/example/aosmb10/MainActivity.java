package com.example.aosmb10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    public void action(String doctor){
        Log.d("доктор", "доктор: " + doctor);
        Log.d("Лог", "Работает");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(() -> {
                action("Доктор 1");
                action("Доктор 2");
                action("Доктор 3");

            });
        executor.shutdown();}
    }
