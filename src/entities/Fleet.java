package entities;

import java.util.List;

public class Fleet {

	private List<Car> carList;
	
	
	public Fleet() {
		super();
	}
	
	public Fleet(List<Car> carList) {
		super();
		this.carList = carList;
	}


	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	
}
