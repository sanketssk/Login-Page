package com.example.persistent_assign1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.username);
        et2=findViewById(R.id.password);
        button=findViewById(R.id.login);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=et1.getText().toString();
                String password=et2.getText().toString();
                if(et2.length()<8){
//                    Toast.makeText(this, "Login success", Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"Min 8 char required",Toast.LENGTH_LONG).show();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), SecondScreen.class);
                    intent.putExtra("username", username);
                    intent.putExtra("password", password);
                    startActivity(intent);
                }
            }
        });
    }


}