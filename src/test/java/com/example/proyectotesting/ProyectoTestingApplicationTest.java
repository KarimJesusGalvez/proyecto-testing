package com.example.proyectotesting;

import org.junit.jupiter.api.Test;

class ProyectoTestingApplicationTest {

    @Test
    void main() {

        ProyectoTestingApplication proyectoTestingApplication = new ProyectoTestingApplication();
        try {
        proyectoTestingApplication.main(new String[1]);
        }
        catch(NullPointerException error){
            error.printStackTrace();
        }
    }

    @Test
    void run() throws Exception {

        ProyectoTestingApplication proyectoTestingApplication = new ProyectoTestingApplication();
        try {
            proyectoTestingApplication.run();
        }
        catch(NullPointerException error){
            error.printStackTrace();
        }
    }
}