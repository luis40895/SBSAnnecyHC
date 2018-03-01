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
	
	public Ride getNearestRide(Vehicle pVehicle, List<Ride> pRideList, int pMaxStep) {
		Ride result = null;
		int resultDiff = Integer.MAX_VALUE;
		
		for(Ride each : pRideList) {
			//int resultDiff = Math.abs((result.getStartIntersection().getX() - pVehicle.getCoordinate().getX()) + (result.getStartIntersection().getY() - pVehicle.getCoordinate().getY()));
			//int eachDiff = Math.abs((each.getStartIntersection().getX() - pVehicle.getCoordinate().getX()) + (each.getStartIntersection().getY() - pVehicle.getCoordinate().getY()));
			if(result != null) {
				resultDiff = getDistance(result.getStartIntersection(), pVehicle.getCoordinate());	
			}
			int eachDiff = getDistance(each.getStartIntersection(), pVehicle.getCoordinate());
			
			int rideDist = getDistance(each.getStartIntersection(), each.getFinishIntersection());
			
			
			if(eachDiff < resultDiff && pVehicle.getCurrentStep() + rideDist  + eachDiff < pMaxStep) {
				pVehicle.setCurrentStep(pVehicle.getCurrentStep() + rideDist + eachDiff);
				pVehicle.addRide(each);
				result = each;
				break;
			}
		}
		return result;
	}
	
	public int getDistance(Coordinate pACoordinate, Coordinate pBCoordinate) {
		return Math.abs(pACoordinate.getX() - pBCoordinate.getX()) + Math.abs(pACoordinate.getY() - pBCoordinate.getY());
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
