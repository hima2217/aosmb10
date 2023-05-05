package com.example.aosmb10;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import java.util.concurrent.TimeUnit;

import javax.xml.transform.Result;

public class DocWorker extends Worker {


    private static final String TAG = DocWorker.class.getSimpleName();

    private String task;


    public DocWorker(@NonNull Context appContext, @NonNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
    }

    @NonNull
    @Override
    public Result doWork() {
        Context applicationContext = getApplicationContext();
            getDocinfo(55000);
            getDocinfo(70000);
            getDocinfo(56500);
        return Result.failure();
    }
    private void getDocinfo(int salary){
        Log.d("Фио", "Фамилия имя оттечтво");
        Log.d("Зарплата", "Зарплата доктора: " + salary);
    }
}

