package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import entities.Fleet;
import entities.Ride;
import entities.Vehicle;

public class RideFileWriter {
	
	public static void writeRidesForCars(Fleet fleet) throws FileNotFoundException, IOException
	{		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("result.out"), "utf-8"))) 
		{
			for(Vehicle v : fleet.getVehicleList()) 
			{
				int i= 0;
				for (Ride r : v.getRides())
				{
					writer.write(r.getId());
					if(i>0) 
					{
						writer.write(r.getId());
					}
				}
			}
			writer.write("\n");
		}
	}
}
