package entities;

import java.util.List;

public class Fleet {

	private List<Vehicle> vehicleList;
	
	public Fleet() {
		super();
	}

	public Fleet(List<Vehicle> vehicleList) {
		super();
		this.vehicleList = vehicleList;
	}

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}
}
