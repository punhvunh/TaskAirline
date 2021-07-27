package com.epam.jwd.task1.obj;

import com.epam.jwd.task1.logic.OperationWithPlane;

import java.util.Objects;

public class AirlinePark implements OperationWithPlane {

	public String model;
	private int passengerCapacity;
	private double carryingCapacity;
	public int rangeOfFlight;
	private int fuelConsumption;
	private int speed;

	public AirlinePark(){

	}

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

	public void setModel(String model) {
		this.model = model;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public double getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(double carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}

	public int getRangeOfFlight() {
		return rangeOfFlight;
	}

	public void setRangeOfFlight(int rangeOfFlight) {
		this.rangeOfFlight = rangeOfFlight;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getSpeed() {
		return speed;
	}

	private void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int findTimeOfTravel() {
		return rangeOfFlight/speed;
	}

	@Override
	public int findAmountOfFuel() {
		return  rangeOfFlight*fuelConsumption;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		final AirlinePark that = (AirlinePark) o;
		return passengerCapacity == that.passengerCapacity
				&& Double.compare(that.carryingCapacity, carryingCapacity) == 0 && rangeOfFlight == that.rangeOfFlight
				&& fuelConsumption == that.fuelConsumption && speed == that.speed && Objects.equals(model, that.model);
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, passengerCapacity, carryingCapacity, rangeOfFlight, fuelConsumption, speed);
	}

	@Override
	public String toString() {
		return  String.format("%-10s " +
				"Model: %s | " +
				"Passenger Capacity: %s | " +
				"Carrying Capacity: %s |" +
				"Range of Flight: %s |" +
				"Fuel Consumption: %s |" +
				"Speed: %s |",
				getClass().getSimpleName(), getModel(), getPassengerCapacity(), getCarryingCapacity(),
				getRangeOfFlight(), getFuelConsumption(), getSpeed());
	}
}

