package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class osh_Updatepart1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.osh_activity_updatepart1);
    }

    public void  Updatepart(View view){
        Intent intent1 = new Intent(this, osh_display.class);
        startActivity(intent1);
    }
}