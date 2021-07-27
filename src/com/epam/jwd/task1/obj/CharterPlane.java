package com.epam.jwd.task1.obj;

import java.util.Objects;

public class CharterPlane extends AirlinePark {
	private int rentPrice;
	private String bathroom;
	private String sofa;

	public CharterPlane (String model, int passengerCapacity, double carryingCapacity, int rangeOfFlight,
						 int fuelConsumption, int speed, int rentPrice, String bathroom, String sofa) {
		super(model, passengerCapacity, carryingCapacity, rangeOfFlight, fuelConsumption, speed);
		this.rentPrice = rentPrice;
		this.bathroom = bathroom;
		this.sofa = sofa;
	}

	public int getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}

	public String getBathroom() {
		return bathroom;
	}

	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	public String getSofa() {
		return sofa;
	}

	public void setSofa(String sofa) {
		this.sofa = sofa;
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
		final CharterPlane that = (CharterPlane) o;
		return rentPrice == that.rentPrice && Objects.equals(bathroom, that.bathroom) && Objects.equals(sofa,
				that.sofa);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), rentPrice, bathroom, sofa);
	}

	@Override
	public String toString() {
		return  String.format("%-10s " +
						"Model: %s | " +
						"Passenger Capacity: %s | " +
						"Carrying Capacity: %s |" +
						"Range of Flight: %s |" +
						"Fuel Consumption: %s |" +
						"Speed: %s |"+
						"Rent Price: %s |" +
						"Bathroom: %s |" +
						"Sofa: %s |",
				getClass().getSimpleName(), getModel(), getPassengerCapacity(), getCarryingCapacity(),
				getRangeOfFlight(), getFuelConsumption(), getSpeed(), getRentPrice(),
				getBathroom(), getSofa());
	}
}