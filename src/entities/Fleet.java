package entities;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

	private List<Vehicle> vehicleList;
	
	public Fleet() {
		super();
		vehicleList = new ArrayList();
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
