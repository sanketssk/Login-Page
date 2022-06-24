package com.example.persistent_assign1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        t=findViewById(R.id.output);
        Intent intent=getIntent();
        String str=intent.getStringExtra("username");
        t.setText("Username is: "+str);
    }
}