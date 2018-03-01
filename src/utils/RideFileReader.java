package utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Ride;

public class RideFileReader {
	
	public List<Ride> getRides() throws FileNotFoundException, IOException
	{
		
		List<Ride> rides = new ArrayList<>();
		ClassLoader classLoader = getClass().getClassLoader();
		
		try(BufferedReader br = new BufferedReader(new FileReader(classLoader.getResource("e_high_bonus.in").getFile()))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    int i = 0;
		    while (line != null) 
		    {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		        if(i>0) 
		        {
			        String[] s = line.split(" ");
			        Ride r = new Ride();
			        r.setStartIntersection(new Coordinate(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
			        r.setFinishIntersection(new Coordinate(Integer.parseInt(s[2]), Integer.parseInt(s[3])));
			        r.setEarliestStep(Integer.parseInt(s[4]));
			        r.setLatestStep(Integer.parseInt(s[5]));
			        r.setId(i-1);
			        rides.add(r);
		        }
		        i++;
		    }
		    return rides;
		}
	}

	public List<Integer> getFirstLineValues() throws FileNotFoundException, IOException
	{
		ClassLoader classLoader = getClass().getClassLoader();
		List<Integer> values = new ArrayList<Integer>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(classLoader.getResource("e_high_bonus.in").getFile()))) 
		{
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
		    String[] s = line.split(" ");
		    values.add(Integer.parseInt(s[0]));
		    values.add(Integer.parseInt(s[1])); 
		    values.add(Integer.parseInt(s[2])); 
		    values.add(Integer.parseInt(s[3])); 
		    values.add(Integer.parseInt(s[4])); 
		    values.add(Integer.parseInt(s[5])); 
		}
		
		return values;
	}
	
	
	
}
