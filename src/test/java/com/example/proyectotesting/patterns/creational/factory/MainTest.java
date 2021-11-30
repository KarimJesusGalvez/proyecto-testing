package com.example.proyectotesting.patterns.creational.factory;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class MainTest {

    @Test
    void main() {
        try {
            Main main = new Main();
            main.main(new String[1]);
            assertTrue(true);
        }catch (Exception error){
            error.printStackTrace();
            assertTrue(false);
        }
    }
}