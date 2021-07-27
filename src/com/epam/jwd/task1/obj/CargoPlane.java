package com.epam.jwd.task1.obj;

import java.util.Objects;

public class CargoPlane extends AirlinePark {
	private double shippingCost;
	private String loadingEquipment;
	private String unloadingEquipment;

	public CargoPlane(final String model, int passengerCapacity, double carryingCapacity, int rangeOfFlight,
			int fuelConsumption, int speed, double shippingCost, String loadingEquipment, String unloadingEquipment) {
		super(model, passengerCapacity, carryingCapacity, rangeOfFlight, fuelConsumption, speed);
		this.shippingCost = shippingCost;
		this.loadingEquipment = loadingEquipment;
		this.unloadingEquipment = unloadingEquipment;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public String getLoadingEquipment() {
		return loadingEquipment;
	}

	public void setLoadingEquipment(String loadingEquipment) {
		this.loadingEquipment = loadingEquipment;
	}

	public String getUnloadingEquipment() {
		return unloadingEquipment;
	}

	public void setUnloadingEquipment(String unloadingEquipment) {
		this.unloadingEquipment = unloadingEquipment;
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
		final CargoPlane that = (CargoPlane) o;
		return Double.compare(that.shippingCost, shippingCost) == 0 && Objects.equals(loadingEquipment,
				that.loadingEquipment) && Objects.equals(unloadingEquipment, that.unloadingEquipment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), shippingCost, loadingEquipment, unloadingEquipment);
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
						"Shipping Cost: %s |" +
				        "Loading Equipment: %s |" +
				        "Unloading Equipment: %s |",
				getClass().getSimpleName(), getModel(), getPassengerCapacity(), getCarryingCapacity(),
				getRangeOfFlight(), getFuelConsumption(), getSpeed(), getShippingCost(),
				getLoadingEquipment(), getUnloadingEquipment());
	}
}