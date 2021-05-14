package com.addressbooksystem;

import java.io.IOException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class AddressBook_Main {
	
	public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
		
		CSVWriter_writeAddressBook write = new CSVWriter_writeAddressBook();
		write.addDataToAddressBook();
		
		CSVReader_readAddressBook read = new CSVReader_readAddressBook();
		read.readDatafromCSV();
		
	}

}
