package com.example.demouitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button circlebtn;
private  Button squarebtn;
private  Button nxtbtn;
private TextView textset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circlebtn= findViewById(R.id.cbtn);
        squarebtn= findViewById(R.id.sbtn);
        nxtbtn=findViewById(R.id.next);
        textset=findViewById(R.id.textView);

        circlebtn.setOnClickListener( v -> {
            Circle cobj= new Circle("circle",2);
            textset.setText("circle");
        });
        squarebtn.setOnClickListener( v -> {
            Square sobj= new Square("square",2);
            textset.setText("square");
        });
        nxtbtn.setOnClickListener(v -> {
            Intent intent= new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });

    }
}