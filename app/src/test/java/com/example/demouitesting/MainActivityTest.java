package com.example.demouitesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainActivityTest {
@Test
    public  void chek(){

    Square s=new Square("ccc",2);
    assertEquals(4.0,s.area(),0.001);
}

}