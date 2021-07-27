package com.epam.jwd.task1.obj;

import java.util.Objects;

public class PassengerPlane extends AirlinePark {
	private double ticketPrice;
	private double passengerBaggageWeight;

	public PassengerPlane(String model, int passengerCapacity, double carryingCapacity, int rangeOfFlight,
						  int fuelConsumption, int speed, double ticketPrice, double passengerBaggageWeight) {
		super(model, passengerCapacity, carryingCapacity, rangeOfFlight, fuelConsumption, speed);
		this.ticketPrice = ticketPrice;
		this.passengerBaggageWeight = passengerBaggageWeight;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public double getPassengerBaggageWeight() {
		return passengerBaggageWeight;
	}

	public void setPassengerBaggageWeight(double passengerBaggageWeight) {
		this.passengerBaggageWeight = passengerBaggageWeight;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}
		final PassengerPlane that = (PassengerPlane) o;
		return Double.compare(that.ticketPrice, ticketPrice) == 0
				&& Double.compare(that.passengerBaggageWeight, passengerBaggageWeight) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), ticketPrice, passengerBaggageWeight);
	}

	@Override
	public String toString() {
		return  String.format("%-10s " +
						"Model: %s | " +
						"Passenger Capacity: %s | " +
						"Carrying Capacity: %s |" +
						"Range of Flight: %s |" +
						"Fuel Consumption: %s |" +
						"Speed: %s |" +
						"Ticket Price: %s |" +
						"Passenger Baggage Weight: %s |",
				getClass().getSimpleName(), getModel(), getPassengerCapacity(), getCarryingCapacity(),
				getRangeOfFlight(), getFuelConsumption(), getSpeed(), getTicketPrice(),
				getPassengerBaggageWeight());
	}
}