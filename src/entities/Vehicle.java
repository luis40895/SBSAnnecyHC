package entities;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

	private boolean busy;
	
	private List<Ride> rides;

	
	public Vehicle(boolean busy) {
		super();
		this.busy = busy;
	}

	/**
	 * Change the busy state of the vehicle
	 */
	public void changeState() {
		this.busy = !busy;
	}
	
	/**
	 * Allow to add a ride to the ride list of the vehicle
	 * @param pRide
	 */
	public void addRide(Ride pRide) {
		if(rides.size() == 0) {
			rides = new ArrayList<Ride>();
		}
		this.rides.add(pRide);
	}
	
	
	/*---------------------------------*/
	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	public List<Ride> getRides() {
		return rides;
	}

	public void setRides(List<Ride> rides) {
		this.rides = rides;
	}
}
