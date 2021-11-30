package com.example.proyectotesting.patterns.creational.prototype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void copy() {
        int radius = 1;
        Circle newCircle = new Circle("red",radius );
        
        assertEquals("red", newCircle.getColor());

        Shape forma = newCircle.copy();
    }
}