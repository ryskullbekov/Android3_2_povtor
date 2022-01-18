package com.example.myapplication.ui.App;

import android.app.Application;

import com.example.myapplication.data.remote.PostApi;
import com.example.myapplication.data.remote.RetrofitClient;

public class App extends Application {

    public static PostApi api;

    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitClient client = new RetrofitClient();
        api = client.provideApi();
    }
}
