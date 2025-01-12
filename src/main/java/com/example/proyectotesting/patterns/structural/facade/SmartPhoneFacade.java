package com.example.proyectotesting.patterns.structural.facade;


import com.example.proyectotesting.patterns.structural.facade.pieces.*;

import java.util.Arrays;
import java.util.List;

public class SmartPhoneFacade {


	/**
	 * Creates a Smartphone with all its components
	 * @return the Smartphone created
	 */
	public static SmartPhone startSmartPhone() {
		
		// ensamblar el smartphone y encenderlo
		Battery battery = new Battery();
		
		CPU cpu = new CPU();
		
		Screen screen = new Screen();
		
		Sensor gps = new GPSSensor();

		Sensor nfc = new NFCSensor();
		List<Sensor> sensors = Arrays.asList(gps, nfc);
		
		SmartPhone oneplus = new SmartPhone(battery, cpu, screen, sensors);
		
		
		oneplus.start();
		
		for (Sensor sensor : oneplus.getSensors()) {
			sensor.start();
		}
		
//		oneplus.checkSIM();
//		oneplus.start();
//		oneplus.checkConnectivity();
		return oneplus;
		
	}
	
	
	
}
