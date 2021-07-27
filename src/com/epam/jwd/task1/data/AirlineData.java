package com.epam.jwd.task1.data;

import com.epam.jwd.task1.obj.AirlinePark;
import com.epam.jwd.task1.obj.CharterPlane;
import com.epam.jwd.task1.obj.CargoPlane;
import com.epam.jwd.task1.obj.PassengerPlane;


public class AirlineData {

	public static AirlinePark[] airlines;

	public static AirlinePark[] List(){
		airlines = new AirlinePark[]{
				   new CharterPlane("Cessna 560XL Citation Excel",12,390.5,3889,
						   20,815,1500,"Golden Bath", "Unfolding sofa"),
				   new CharterPlane("Ember Phenom 100",7,1535.5,2182,
						   28,722,2500, "Heated bath","Wooden sofa"),
				   new CargoPlane("АН-124-100",28,120000,7500,30,850,400000,
						   "CraneBeam", "Elevator" ),
				   new CargoPlane("ИЛ-76",126,60000,4000,35,900,350550,
						   "CraneBeam", "Elevator"),
                   new PassengerPlane("Boeing 747-8",467,214500,14815,40,870,
						   200, 15),
                   new PassengerPlane("Airbus A380",525,280000,15200,60,920,
						   250,20)};
		return airlines;
	}
}
