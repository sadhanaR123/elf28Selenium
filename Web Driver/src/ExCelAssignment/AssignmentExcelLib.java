package ExCelAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/***
 * 
 * @author Sadhana
 *
 */
public class AssignmentExcelLib {

	static String excelPath = "./testResources/testData1.xlsx";

	//*********** Read StringData ***************//
	/**
	 * This method is used to read string data from an excel file
	 * @param sheetName provide the sheet name where you have the test data.
	 * @param rowNum provide the row number where you have the test data.
	 * @param cellNum provide the cell number where you have the test data.
	 * @return it returns the data in the respective sheet, row, cell in the form of String.
	 */
	public static String readStringData(String sheetName , int rowNum , int cellNum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}

	//*********** Read NumberData ***************//
	/**
	 * This method is used to read Number data from an excel file
	 * @param sheetName provide the sheet name where you have the test data.
	 * @param rowNum provide the row number where you have the test data.
	 * @param cellNum provide the cell number where you have the test data.
	 * return it returns the data in the respective sheet, row, cell in the form of Number.
	 */
	public static double readNumberData(String sheetName , int rowNum , int cellNum) {
		Workbook workbook = null;
		try { 
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}

	//*********** Read BooleanData ***************//
	/**
	 * This method is used to read Boolean data from an excel file
	 * @param sheetName provide the sheet name where you have the test data.
	 * @param rowNum provide the row number where you have the test data.
	 * @param cellNum provide the cell number where you have the test data.
	 * return it returns the data in the respective sheet, row, cell in the form of boolean.
	 */
	public static boolean readbooleanData(String sheetName , int rowNum , int cellNum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
	}


	//*********** Read DateData ***************//
	/**
	 * This method is used to read Date data from an excel file
	 * @param sheetName provide the sheet name where you have the test data.
	 * @param rowNum provide the row number where you have the test data.
	 * @param cellNum provide the cell number where you have the test data.
	 * return it returns the data in the respective sheet, row, cell in the form of Date.
	 */
	public static LocalDateTime readDateData(String sheetName , int rowNum , int cellNum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getLocalDateTimeCellValue();
	}

}
