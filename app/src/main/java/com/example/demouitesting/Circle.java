package com.example.demouitesting;

public class Circle extends Shape {
    private float radius;

    public Circle( float radius) {
 this.name="circle";
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float)3.1416 * radius * radius;
    }

    @Override
    public float perimeter() {
        return 2 * (float)3.1416 * radius;
    }


}