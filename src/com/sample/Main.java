package com.sample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import utils.RideFileReader;

public class Main {

	public static void main(String[] args){
		List<String> rides = new ArrayList<>();
		
		RideFileReader r = new RideFileReader();
		
		try {
			rides = r.getRides();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String s : rides) {
			System.out.println(s);
		}
	}
	
	
	
}

