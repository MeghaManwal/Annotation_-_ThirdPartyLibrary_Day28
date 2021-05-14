package com.addressbooksystem;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter_writeAddressBook {

    public static final String path = "C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day28_FileRead_Write\\annotationsAndthirdpartylibrary\\Data\\AddressBook1.csv";
	
    public void addDataToAddressBook() throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		
		Writer writer = Files.newBufferedWriter(Paths.get(path));
		
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		StatefulBeanToCsv<Person> beanToCsv = new StatefulBeanToCsvBuilder(writer)
				                              .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
				                              .build();

		List<Person> persons = new ArrayList<>(); 
		
		persons.add(new Person ("Neha","Sharma","Doiwala","Tehri","Uttarakhand","246788","9245236663","neha@gmail.com"));
		persons.add(new Person ("Raj","Kapoor","Ranipur","Rishikesh","Utttarakhand","7364733","7354466276","Raj@outlook.com"));
		persons.add(new Person ("Rohit","Singh","BTM Layout","Bangalore","Karnataka","6544637","93463543776","Rohit15@orkut.com"));
		persons.add(new Person ("Minal","Prasad","Hulimavu","Bangalore","Karnataka","345998","9364637377","minal##@gmail.com"));
		persons.add(new Person ("Vandana","Rawat","Raipur","Lucknow","Uttar Pradesh","800976","96365367352","vandana@source.co.in"));
		persons.add(new Person ("Anjali","Negi","Hinjewadi","Pune","Maharashtra","654443","73656386356","anjali2355@outlook.com"));
		
		beanToCsv.write(persons);
				
	}  

}
