package com.example.demouitesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class itTest {

        @Test
        public void testCircleRed() {
            Circle circle = new Circle(2);
            Red red = new Red();

            assertEquals("Circle", circle.name);
            assertEquals("Red", red.name);
        }

        @Test
        public void testSquareBlue() {
            Square square = new Square(4);
            Blue blue = new Blue();

            assertEquals("Square", square.name);
            assertEquals("Blue", blue.name);
        }

        @Test
        public void testTriangleGreen() {
            Triangle triangle = new Triangle(3, 4, 5);
            Green green = new Green();

            assertEquals("Triangle", triangle.name);
            assertEquals("Green", green.name);
        }
    }
