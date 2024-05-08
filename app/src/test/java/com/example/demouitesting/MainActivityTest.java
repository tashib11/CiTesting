package com.example.demouitesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivityTest {

    @Test
    public  void squareName(){
        Square s = new Square( 2);
        assertEquals("square", s.name);
    }
    @Test
    public void squareAreaChek() {

        Square s = new Square( 2);
        assertEquals(4.0, s.area(), 0.001);
    }
    @Test
    public void squarePeriChek() {

        Square s = new Square( 2);
        assertEquals(8.0, s.perimeter(), 0.001);
    }


    @Test
    public  void circleName(){
        Circle s = new Circle( 2);
        assertEquals("circle", s.name);
    }
    @Test
    public void circleAreaChek() {

        Circle circle = new Circle(2);
        assertEquals(12.56637f, circle.area(), 0.001);
    }
    @Test
    public void circlePeriChek() {

        Circle circle = new Circle(2);
        assertEquals(12.56637f, circle.perimeter(), 0.001);
    }


    @Test
    public  void triangleName(){
        Triangle s = new Triangle( 3, 4, 5);
        assertEquals("triangle", s.name);
    }
    @Test
    public void triangleAreaChek() {

        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6, triangle.area(), 0.001);
    }
    @Test
    public void trianglePeriChek() {

        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.perimeter(), 0.001);
    }
    @Test
    public void testRedColor() {
        Red red = new Red();
        assertEquals("red", red.showColor());
    }
    @Test
    public void testBlueColor() {
        Blue blue = new Blue();
        assertEquals("blue", blue.showColor());
    }

    @Test
    public void testGreenColor() {
        Green green = new Green();
        assertEquals("green", green.showColor());
    }
}