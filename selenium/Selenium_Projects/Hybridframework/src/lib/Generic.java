package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic 
{
public static String GetDataFromExcel(String filepath,String sheetname,int r,int c) 
{
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(filepath);
	} catch (FileNotFoundException e) {
		
	}
	Workbook wb = null;
	try {
		wb = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException e) {
	
	} catch (InvalidFormatException e) {
	
	} catch (IOException e) {
	
	}
	String output=wb.getSheet(sheetname).getRow(r).getCell(c).getStringCellValue();	
	return output;
}


public static int findLastindex(String filepath,String sheetname)
{
	
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(filepath);
	} catch (FileNotFoundException e) {
		
	}
	Workbook wb = null;
	try {
		wb = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException e) {
	
	} catch (InvalidFormatException e) {
	
	} catch (IOException e) {
	
	}
    int i=wb.getSheet(sheetname).getLastRowNum();
    return i;	
}

public static void writedata(String filepath,String sheetname,int r,int c,String data) 
{
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(filepath);
	} catch (FileNotFoundException e) {
		
	}
	Workbook wb = null;
	try {
		wb = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException e) {
	
	} catch (InvalidFormatException e) {
	
	} catch (IOException e) {
	
	}
	wb.getSheet(sheetname).getRow(r).getCell(c).setCellValue(data);

	FileOutputStream fos = null;
	try {
		fos = new FileOutputStream(filepath);
	} catch (FileNotFoundException e) {
		
	}
	
	try {
		wb.write(fos);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}











