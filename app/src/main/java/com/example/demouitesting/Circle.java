package com.example.demouitesting;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
 this.name=name;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Getters and setters for radius
}