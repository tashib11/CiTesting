package com.example.demouitesting;

public class Square extends Shape {
    private float sideLength;

    public Square( float sideLength) {
        this.name = "square";
        this.sideLength = sideLength;
    }

    @Override
    public float area() {
        return sideLength * sideLength;
    }

    @Override
    public float perimeter() {
        return 4 * sideLength;
    }
}