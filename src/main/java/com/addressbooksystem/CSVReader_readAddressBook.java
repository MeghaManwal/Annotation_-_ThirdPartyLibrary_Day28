package com.addressbooksystem;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CSVReader_readAddressBook {
	
private static final String path = "C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day28_FileRead_Write\\annotationsAndthirdpartylibrary\\Data\\AddressBook.csv";
    
	
	
	public  void readDatafromCSV() throws IOException {
		
		Reader reader = Files.newBufferedReader(Paths.get(path));
	
		@SuppressWarnings({ "unchecked", "rawtypes" })
		CsvToBean <Person> csvToBean = new CsvToBeanBuilder(reader)
		                             .withType(Person.class)
		                             .withIgnoreLeadingWhiteSpace(true)
		                             .build();
		Iterator <Person> personIterator = csvToBean.iterator();

        while (personIterator.hasNext()) {
        	Person person = personIterator.next();
			System.out.println("Firstname: "+ person.getFirstname());
			System.out.println("Lastname: "+ person.getLastname());
			System.out.println("Address: "+ person.getAddress());
			System.out.println("City: "+ person.getCity());
			System.out.println("State: "+ person.getState());
			System.out.println("ZipCode: "+ person.getZip());
			System.out.println("PhoneNumber: "+ person.getphoneNumber());
			System.out.println("EmailId: "+ person.getemail());
			System.out.println("------------------------------------\n");
			
		}	
		
	}
	
}
