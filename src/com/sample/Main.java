package com.sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Fleet;
import entities.Ride;
import entities.Vehicle;
import utils.Coordinate;
import utils.RideFileReader;

public class Main {
	
	private static List<Ride> ridesList = new ArrayList<Ride>();
	
	private static Fleet fleet;
	
	private static int numberOfCar;
	
	private static int colMax;
	
	private static int rowMax;
	
	private static int maxStep;

	public static void main(String[] args){
		
		init();
		
	}
	
	public static void init() {
		List<String> rides = new ArrayList<>();
		RideFileReader r = new RideFileReader();

		try {
			ridesList = r.getRides();
			List<Integer> v = r.getFirstLineValues();
			rowMax = v.get(0);
			colMax = v.get(1);
			numberOfCar = v.get(2);
			maxStep = v.get(5);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fleet = new Fleet();
		for(int i=0; i<numberOfCar; i++) {
			Vehicle vehicle = new Vehicle();
			vehicle.setCoordinate(new Coordinate(0, 0));
			fleet.getVehicleList().add(vehicle);
		}
	}
	
	
	
}

