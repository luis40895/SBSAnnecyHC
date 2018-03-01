package utils;

import java.util.HashMap;
import java.util.List;

public class Coordinate {

	private int x;
	
	private int y;
	
	private HashMap<Integer,Integer> coordinates;
	
	public HashMap<Integer,Integer> getCoordinates(){
		coordinates.put(x, y);
		return coordinates;
	}

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
