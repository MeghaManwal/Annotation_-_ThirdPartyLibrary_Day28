package com.jsonfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CsvToJsonConversion {
	
	public static void csvTojsonConversion(String csvPath, String jsonPath) throws IOException {
		
		Reader reader = Files.newBufferedReader(Paths.get(csvPath));
		CsvToBeanBuilder<Person> csvToBeanBuilder = new CsvToBeanBuilder<>(reader);
		csvToBeanBuilder.withType(Person.class);
		csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
		
		CsvToBean<Person> csvToBean = csvToBeanBuilder.build();
		List<Person> persons = csvToBean.parse();
		Gson gson = new Gson();
		String json = gson.toJson(persons);
		
		FileWriter writer = new FileWriter(jsonPath);
		writer.write(json);
		writer.close();
		
		BufferedReader br = new BufferedReader(new FileReader(jsonPath));
		Person [] usrObj = gson.fromJson(br, Person[].class);
		
		@SuppressWarnings("unused")
		List<Person> personsList = Arrays.asList(usrObj);
	}
	
	public static void main(String[] args) throws IOException {
		String csvPath = " C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day28_FileRead_Write\\annotationsAndthirdpartylibrary\\Data\\AddressBook.csv";
		String jsonPath = " C:\\Users\\Varsha Manwal\\Desktop\\BridgeLabz\\Fellowship\\Day28_FileRead_Write\\annotationsAndthirdpartylibrary\\Data\\AddressBook.json";
		
		csvTojsonConversion(csvPath, jsonPath);
		
	}


}
