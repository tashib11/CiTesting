package com.example.demouitesting;

import static java.lang.Math.sqrt;

public class Triangle extends  Shape {
    float side1,side2,side3;
    Triangle(float s1, float  s2,float s3){
        side1=s1;
        side2= s2;
        side3=s3;
    }
    public float area() {
        float s = (side1 + side2 + side3) / 2;


        float ar = (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return ar;
    }
    public float perimeter() {
        float pe = side1 + side2 + side3;
        return pe;
    }
}
