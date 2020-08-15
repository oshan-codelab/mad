package com.example.mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  Update(View view){
        Intent intent1 = new Intent(this,display.class);
        startActivity(intent1);
    }

    public void  Delete(View view){
        Intent intent1 = new Intent(this,delete.class);
        startActivity(intent1);
    }

}