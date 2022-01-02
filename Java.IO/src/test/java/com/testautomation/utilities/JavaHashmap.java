package com.testautomation.utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

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
	
	@Test
	public void canHydrateObject() {
		
		String file = "/Users/tealek.alnutt/Downloads/basses.csv";
		
		try {
			FileReader fileReader = new FileReader(file);
		
			CSVParser parser = new CSVParserBuilder() . withSeparator(',').build();
			CSVReader csvReader = new CSVReaderBuilder(fileReader)
								.withCSVParser(parser)
								.build();	
		
			List<String[]> allData = csvReader.readAll();
		
			for (String[] row : allData) {
				for (String cell : row) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return;
		
	}
		
		
}
