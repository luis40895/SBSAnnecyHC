package utils;

import java.util.HashMap;
import java.util.List;

import entities.Ride;
import entities.Vehicle;

public class Coordinate {

	private int x;
	
	private int y;
	
	private HashMap<Integer,Integer> coordinates;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public HashMap<Integer,Integer> getCoordinates(){
		coordinates.put(x, y);
		return coordinates;
	}
	
	public Ride getNearestRide(Vehicle pVehicle, List<Ride> pRideList) {
		Ride result = null;
		for(Ride each : pRideList) {
			if(result == null) {
				result = each;
			}else {
				
				int resultDiff = Math.abs((result.getStartIntersection().getX() - pVehicle.getCoordinate().getX()) + (result.getStartIntersection().getY() - pVehicle.getCoordinate().getY()));
				int eachDiff = Math.abs((each.getStartIntersection().getX() - pVehicle.getCoordinate().getX()) + (each.getStartIntersection().getY() - pVehicle.getCoordinate().getY()));

				if(eachDiff < resultDiff) {
					result = each;
				}
			}
		}
		return result;
	}
	
	/*-----------------*/
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
