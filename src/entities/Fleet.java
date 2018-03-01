package entities;

import java.util.List;

public class Fleet {

	private List<Vehicle> carList;
	
	
	public Fleet() {
		super();
	}
	
	public Fleet(List<Vehicle> carList) {
		super();
		this.carList = carList;
	}


	public List<Vehicle> getCarList() {
		return carList;
	}

	public void setCarList(List<Vehicle> carList) {
		this.carList = carList;
	}
	
}
