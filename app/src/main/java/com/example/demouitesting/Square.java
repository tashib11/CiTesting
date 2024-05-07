package com.example.demouitesting;

public class Square extends Shape {
    private double sideLength;

    public Square(String name, double sideLength) {
        this.name = name;
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }
}