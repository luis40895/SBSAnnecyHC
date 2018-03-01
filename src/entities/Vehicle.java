package entities;

import java.util.ArrayList;
import java.util.List;

import utils.Coordinate;

public class Vehicle {

	private boolean busy;
	
	private List<Ride> rides;
	
	private Coordinate coordinate;
	
	/*---------------------------------*/
	
	public Vehicle(boolean busy, List<Ride> rides, Coordinate coordinate) {
		super();
		this.busy = busy;
		this.rides = rides;
		this.coordinate = coordinate;
	}

	public Vehicle(boolean busy) {
		super();
		this.busy = busy;
	}

	public Vehicle() {
		super();
		busy=false;
	}
	/*-----------------------------------------*/

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
	
	public void moveUp() {
		this.coordinate.setY(this.coordinate.getY() + 1);
	}
	
	public void moveDown() {
		this.coordinate.setY(this.coordinate.getY() - 1);
	}
	
	public void moveRight() {
		this.coordinate.setX(this.coordinate.getX() + 1);
	}
	
	public void moveLeft() {
		this.coordinate.setX(this.coordinate.getX() - 1);
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

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
}
