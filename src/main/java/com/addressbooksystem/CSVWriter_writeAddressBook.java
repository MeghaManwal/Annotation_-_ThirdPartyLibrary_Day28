package com.addressbooksystem;


import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVWriter_writeAddressBook {

private static String path = "C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day28_FileRead_Write\\annotationsAndthirdpartylibrary\\Data\\AddressBook.csv";
    
	
	public static void addDataToAddressBook() throws IOException {
		
		Writer writer = Files.newBufferedWriter(Paths.get(path));
		
		CSVWriter csvwriter = new CSVWriter(writer);
		List<String[]> data = new ArrayList<String[]>();
		
		data.add(new String[] {"FirstName","LastName","Address","City","State","ZipCode","PhoneNumber","EmailId"});
		data.add(new String[] {"Neha","Sharma","Doiwala","Tehri","Uttarakhand","246788","9245236663","neha@gmail.com"});
		data.add(new String[] {"Raj","Kapoor","Ranipur","Rishikesh","Utttarakhand","7364733","7354466276","Raj@outlook.com"});
		data.add(new String[] {"Rohit","Singh","BTM Layout","Bangalore","Karnataka","6544637","93463543776","Rohit15@orkut.com"});
		data.add(new String[] {"Minal","Prasad","Hulimavu","Bangalore","Karnataka","345998","9364637377","minal##@gmail.com"});
		data.add(new String[] {"Saurav","Chauhan","Vijaywada","Hyderabaad","Telangana","234667","9525626262","saurav.abc@inext.co.in"});
		data.add(new String[] {"Anjali","Negi","Hinjewadi","Pune","Maharashtra","654443","73656386356","anjali2355@outlook.com"});
		data.add(new String[] {"Vandana","Rawat","Raipur","Lucknow","Uttar Pradesh","800976","96365367352","vandana@source.co.in"});
		data.add(new String[] {"Rita","Singh","Kasauli","Shimla","Himachal Pradesh","456732","9273632644","rita!!@google.co.in"});
		
		csvwriter.writeAll(data);
		
		if(data != null) {
		   csvwriter.close();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		addDataToAddressBook();
	}
	

}
