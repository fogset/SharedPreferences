package com.example.tianhao.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.tianhao.sharedpreferences", Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("username", "nick").apply();
        String username = sharedPreferences.getString("username", "");
        Log.i("This is the username", username);
    }
}
