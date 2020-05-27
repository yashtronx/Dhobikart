package com.example.dhobikart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main2);

    }

    public void gta1(View view) {
        startActivity(new Intent(Main2Activity.this,Main3Activity.class));
    }

    public void gta2(View view) {
        startActivity(new Intent(Main2Activity.this,Main4Activity.class));
    }
}
