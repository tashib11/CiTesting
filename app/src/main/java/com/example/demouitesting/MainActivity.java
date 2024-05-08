package com.example.demouitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button circlebtn;
private  Button squarebtn;
    private  Button trianglebtn;
    private  Button redbtn;
    private  Button greenbtn;
    private  Button bluebtn;
    private TextView textset;
    private TextView areaset;
    private TextView periset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circlebtn= findViewById(R.id.cId);
        squarebtn= findViewById(R.id.sId);
        trianglebtn= findViewById(R.id.tId);
        redbtn= findViewById(R.id.redIId);
        bluebtn= findViewById(R.id.blueId);
        greenbtn= findViewById(R.id.greenId);
        textset=findViewById(R.id.textName);
        areaset=findViewById(R.id.areaId);
        periset=findViewById(R.id.perimeterId);

        circlebtn.setOnClickListener( v -> {
            Circle cobj= new Circle(2);
            float ar= cobj.area();
            float pe=cobj.perimeter();
            textset.setText(cobj.name);
            periset.setText(String.valueOf(pe));
            areaset.setText(String.valueOf(ar));

        });

        squarebtn.setOnClickListener( v -> {
            Square cobj= new Square(2);
            float ar= cobj.area();
            float pe=cobj.perimeter();
            textset.setText(cobj.name);
            periset.setText(String.valueOf(pe));
            areaset.setText(String.valueOf(ar));

        });
        trianglebtn.setOnClickListener( v -> {
            Triangle cobj= new Triangle(3, 4, 5);
            float ar= cobj.area();
            float pe=cobj.perimeter();
            textset.setText(cobj.name);
            periset.setText(String.valueOf(pe));
            areaset.setText(String.valueOf(ar));

        });

        redbtn.setOnClickListener(v -> {
            Red obj= new Red();
            String nm= obj.showColor();
            textset.setText(nm);
        });
        greenbtn.setOnClickListener(v -> {
            Green obj= new Green();
            String nm= obj.showColor();
            textset.setText(nm);
        });
        bluebtn.setOnClickListener(v -> {
            Blue obj= new Blue();
            String nm= obj.showColor();
            textset.setText(nm);
        });
    }
}