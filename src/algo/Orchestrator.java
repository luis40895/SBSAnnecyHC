package algo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.sample.Main;

import entities.Ride;
import entities.Vehicle;
import utils.Coordinate;
import utils.EnvParameters;
import utils.RideFileReader;

public class Orchestrator implements Runnable {

	private List<Ride> rides;

	private List<Vehicle> vehicles;

	private int step;

	private RideFileReader rideFileReader;

	private EnvParameters parameters;

	@Override
	public void run() {
		rideFileReader = new RideFileReader();

		// init
		init();

		// start
		start();

	}

	private void start() {
		// launchRides

		
		while (true) {
			boolean hasRideBeenAssociated = false;
			for (Vehicle v : vehicles) {
				Ride ride = Coordinate.getNearestRide(v, rides, Main.maxStep);
				if(ride != null) {
					hasRideBeenAssociated = true;
					v.addRide(ride);
					doRide(v, ride);
				}
			}
			
			if (hasRideBeenAssociated == false) {
				break;
			}
			
			System.out.println(step);
			
			step++;
		}

	}

	private void doRide(Vehicle v, Ride ride) {
		v.changeState();

		v.getCoordinate().setX(ride.getFinishIntersection().getX());
		v.getCoordinate().setY(ride.getFinishIntersection().getY());

		if (ride != null)
			v.getRides().remove(ride);

	}

	public void init() {
		// get env
		try {
			parameters = new EnvParameters(rideFileReader.getFirstLineValues());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// get vehicles
		registerVehicles();
		// get rides
		retrieveRides();

		// first allocation of rides
		startingRidesAllocation();
	}

	private void startingRidesAllocation() {

	}

	public void registerVehicles() {
		vehicles = Main.fleet.getVehicleList();
	}

	public void retrieveRides() {
		rides = new ArrayList<Ride>(Main.ridesList);
	}

	public void allocateRides() {

	}

}
