package com.testautomation.utilities;

import java.io.*;

import org.junit.Test;

public class JavaHashmap {
	
	@Test
	public void canReadBasses() {
		String file = "/Users/tealek.alnutt/Downloads/basses.csv";
		BufferedReader reader = null;
		String line = "";
		
		try {
			reader = new BufferedReader (new FileReader(file));
			while((line = reader.readLine()) !=null) {
				
				String[] row = line.split(",");
				
				for (String index : row) {
					System.out.printf("%-10s", index);
				}
				System.out.println();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
