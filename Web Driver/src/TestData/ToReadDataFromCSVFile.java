package TestData;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ToReadDataFromCSVFile {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("./testResources/testData.csv");
	CSVReader csvReader=new CSVReader(fr);
	String[] usernameData=csvReader.readNext();
	System.out.println(usernameData[2]);
			
}
}
