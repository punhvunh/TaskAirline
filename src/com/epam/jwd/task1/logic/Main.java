package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.data.AirlineData;
import com.epam.jwd.task1.obj.AirlinePark;
import com.epam.jwd.task1.printer.Printer;

public class Main {
	public static final int MAX_FUEL_CONSUMPTION = 28;
	public static final int MIN_FUEL_CONSUMPTION = 21;
	public static final int MAX_SPEED = 920;
	public static final int MIN_SPEED = 915;
	public static void main(String[] args) {
		AirlinePark[] array = AirlineData.List();
		int totalPassengerCapacity = LogisticCenter.calculateTotalPassengerCapacity(array);
		Printer.printString("Total passenger capacity: " + totalPassengerCapacity);

		String findPlaneWithFuelConsumption = LogisticCenter.findPlaneWithFuelConsumption(array, MAX_FUEL_CONSUMPTION, MIN_FUEL_CONSUMPTION);
		Printer.printString("Your plane model: " + findPlaneWithFuelConsumption);

		String findPlaneWithSpeed = LogisticCenter.findPlaneWithSpeed(array, MAX_SPEED, MIN_SPEED);
		Printer.printString("Your plane model: " + findPlaneWithSpeed);

		double totalCarryingCapacity = LogisticCenter.calculateTotalCarryingCapacity(array);
		Printer.printString("Total carrying capacity: " + totalCarryingCapacity);

		String modelOfPlane = LogisticCenter.rangeOfFlightAscendingOrder(array);
		Printer.printString("Models of planes in ascending order by range: " + modelOfPlane);

		String modelOfDesPlane = LogisticCenter.rangeOfFlightDescendingOrder(array);
		Printer.printString("Models of planes in descending order by range: " + modelOfDesPlane);

		AirlinePark  plane = AirlineData.List()[3];
		Printer.printString("Time of travel: " + plane.findTimeOfTravel());
		AirlinePark plane1 = AirlineData.List()[5];
		Printer.printString("Your fare: " + plane1.findAmountOfFuel());

	}
}