package com.addressbooksystem;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.opencsv.CSVReader;

public class CSVReader_readAddressBook {
	
private static final String path = "C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day28_FileRead_Write\\annotationsAndthirdpartylibrary\\Data\\AddressBook.csv";
    
	
	@SuppressWarnings("unused")
	public static void readData() throws IOException {
		
		Reader reader = Files.newBufferedReader(Paths.get(path));
	
		@SuppressWarnings("resource")
		CSVReader csvReader = new CSVReader(reader);
		String [] nextData;
		
		while((nextData=csvReader.readNext()) != null) {
			
			System.out.println("Firstname: "+ nextData[0]);
			System.out.println("Lastname: "+ nextData[1]);
			System.out.println("Address: "+ nextData[2]);
			System.out.println("City: "+ nextData[3]);
			System.out.println("State: "+ nextData[4]);
			System.out.println("ZipCode: "+ nextData[5]);
			System.out.println("PhoneNumber: "+ nextData[6]);
			System.out.println("EmailId: "+ nextData[7]);
			System.out.println("------------------------------------\n");
			
		}
		
		if(nextData != null) {
			   csvReader.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		readData();
	}

}
