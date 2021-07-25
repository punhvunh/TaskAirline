package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.obj.AirlinePark;

public class LogisticCenter {

	public static int calculateTotalPassengerCapacity(AirlinePark[] List) {
		int totalPassengerCapacity = 0;
		for (AirlinePark airlines: List) {
			totalPassengerCapacity += airlines.getPassengerCapacity();
		}
		return totalPassengerCapacity;
	}

	public static double calculateTotalCarryingCapacity(AirlinePark[] List) {
		double totalCarryingCapacity = 0;
		for (AirlinePark airlines: List) {
			totalCarryingCapacity += airlines.getCarryingCapacity();
		}
		return totalCarryingCapacity;
	}

	public static String rangeOfFlightAscendingOrder(AirlinePark[] List) {
		for (int q = 0; q < List.length; q++) {
			for (int i = 0; i < List.length - 1 - q; i++) {
				if (List[i].getRangeOfFlight() > List[i + 1].getRangeOfFlight()) {
					int temp1 = List[i].getRangeOfFlight() ;
					List[i].rangeOfFlight= List[i + 1].rangeOfFlight;
					List[i + 1].rangeOfFlight = temp1;
					String temp2 = List[i].getModel();
					List[i].model= List[i + 1].getModel();
					List[i + 1].model = temp2;
				}
			}
		}
		return List[0].getModel() + " " + List[1].getModel() + " " + List[2].getModel() + " " + List[3].getModel()
				+ " " + List[4].getModel() + " " + List[5].getModel();
	}

	public static String rangeOfFlightDescendingOrder(AirlinePark[] List) {
		for (int q = 0; q < List.length; q++) {
			for (int i = 0; i < List.length - 1 - q; i++) {
				if (List[i].getRangeOfFlight() < List[i + 1].getRangeOfFlight()) {
					int temp1 = List[i].getRangeOfFlight() ;
					List[i].rangeOfFlight= List[i + 1].rangeOfFlight;
					List[i + 1].rangeOfFlight = temp1;
					String temp2 = List[i].getModel();
					List[i].model= List[i + 1].getModel();
					List[i + 1].model = temp2;
				}
			}
		}
		return List[0].getModel() + " " + List[1].getModel() + " " + List[2].getModel() + " " + List[3].getModel()
				+ " " + List[4].getModel() + " " + List[5].getModel();
	}

	public static String findPlaneWithFuelConsumption(AirlinePark[] List, int maxFuelConsumption, int minFuelConsumption) {
		String plane =" ";
		for (AirlinePark airlines: List) {
			if (airlines.getFuelConsumption() <= maxFuelConsumption && airlines.getFuelConsumption()  >= minFuelConsumption) {
				plane = airlines.getModel();
				break;
			} else {
				plane = "There is no such plane model";;
			}
		}
		return plane;
	}

	public static String findPlaneWithSpeed(AirlinePark[] List, int maxSpeed, int minSpeed) {
		String model = " ";
		for (AirlinePark airlines: List) {
			if (airlines.getSpeed() <= maxSpeed && airlines.getSpeed()  >= minSpeed) {
				model = airlines.getModel();
				break;
			} else {
				model = "There is no such plane model";;
			}
		}
		return model;
	}
}
