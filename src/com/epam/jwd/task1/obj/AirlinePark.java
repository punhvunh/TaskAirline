package com.epam.jwd.task1.obj;

import com.epam.jwd.task1.logic.OperationWithPlane;

public class AirlinePark implements OperationWithPlane {

	public String model;
	private final int passengerCapacity;
	private final double carryingCapacity;
	public int rangeOfFlight;
	public int fuelConsumption;
	private final int speed;

	public AirlinePark(String model, int passengerCapacity, double carryingCapacity, int rangeOfFlight,
					   int fuelConsumption, int speed) {
		this.model = model;
		this.passengerCapacity = passengerCapacity;
		this.carryingCapacity = carryingCapacity;
		this.rangeOfFlight = rangeOfFlight;
		this.fuelConsumption = fuelConsumption;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public double getCarryingCapacity() {
		return carryingCapacity;
	}

	public int getRangeOfFlight() {
		return rangeOfFlight;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public int findTimeOfTravel() {
		return rangeOfFlight/speed;
	}

	@Override
	public int findAmountOfFuel() {
		return  rangeOfFlight*fuelConsumption;
	}

	public static class CharterPlane extends AirlinePark {
		public int rentPrice;

		public CharterPlane (String model, int passengerCapacity, double carryingCapacity, int rangeOfFlight,
				int fuelConsumption, int speed, int rentPrice) {
			super(model, passengerCapacity, carryingCapacity, rangeOfFlight, fuelConsumption, speed);
			this.rentPrice = rentPrice;
		}
	}

	public static class CargoPlane extends AirlinePark {

		public double shippingCost;

		public CargoPlane(String model, int passengerCapacity, double carryingCapacity, int rangeOfFlight, int fuelConsumption,
				int speed, double shippingCost) {
			super(model, passengerCapacity, carryingCapacity, rangeOfFlight, fuelConsumption, speed);
			this.shippingCost = shippingCost;
		}
	}


		public static class PassengerPlane extends AirlinePark {
		public double ticketPrice;

		public PassengerPlane(String model, int passengerCapacity, double carryingCapacity, int rangeOfFlight,
							  int fuelConsumption, int speed, double ticketPrice) {
			super(model, passengerCapacity, carryingCapacity, rangeOfFlight, fuelConsumption, speed);
			this.ticketPrice = ticketPrice;
		}
	}
}

