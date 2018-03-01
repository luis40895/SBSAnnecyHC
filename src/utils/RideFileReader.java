package utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RideFileReader {

	
	public List<String> getRides() throws FileNotFoundException, IOException{
		
		List<String> rides = new ArrayList<>();
		ClassLoader classLoader = getClass().getClassLoader();
		
		try(BufferedReader br = new BufferedReader(new FileReader(classLoader.getResource("e_high_bonus.in").getFile()))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		        rides.add(line);
		    }
		    String everything = sb.toString();
		}
		
		return rides;
	}
	
	
}
