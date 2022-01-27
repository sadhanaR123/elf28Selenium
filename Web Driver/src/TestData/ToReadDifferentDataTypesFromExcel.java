package TestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDifferentDataTypesFromExcel {
public static void main(String[] args) throws InvalidFormatException, IOException {
	FileInputStream fis=new FileInputStream("./testResources/testData1.xlsx");
	Workbook workbook=WorkbookFactory.create(fis);
	Row row1=workbook.getSheet("Sheet1").getRow(1);
	RichTextString data1=row1.getCell(1).getRichStringCellValue();
	boolean data2=row1.getCell(2).getBooleanCellValue();
	//java.util.Date data3=(java.util.Date)((Cell) row1).getDateCellValue();
	//LocalDateTime data4=row1.getCell(3).getLocalDateTimeCellValue();
	double data5=row1.getCell(4).getNumericCellValue();
	System.out.println(data1+", "+data2+", "+data5);
}
}
