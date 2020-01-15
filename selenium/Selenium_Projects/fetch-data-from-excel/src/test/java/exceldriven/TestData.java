package exceldriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {
	public FileInputStream fis = null;
	public File tcFile;
	Workbook workbook;

	public void setTestCaseFile(String fileName) {
		this.tcFile = new File(fileName);
		String extension = tcFile.toString().substring(tcFile.toString().lastIndexOf("."));
		try {
			if (extension.equalsIgnoreCase("xlsx")) {

				this.workbook = new XSSFWorkbook(new FileInputStream(tcFile));

			} else {
				this.workbook = new HSSFWorkbook(new FileInputStream(tcFile));
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getDataFromTestDataFile(String sheetName, int rowNumber, int cellNumber) {

		try {

			return this.workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public void getTableDataFromTestDataFileAndVerify(String fileName, String sheetName, String tableName) {
		//String scrFile = ".\\TestData\\" + fileName + ".xlsx";

		try {
			fis = new FileInputStream(scrFile);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			List<XSSFTable> tables = workbook.getSheet(sheetName).getTables();
			for (XSSFTable t : tables) {
				System.out.println(t.getName());

				// Code for traversing the Table elements
				if (tableName.contentEquals(t.getName())) {
					int startRow = t.getStartCellReference().getRow();
					int endRow = t.getEndCellReference().getRow();

					System.out.println("startRow = " + startRow);
					System.out.println("endRow = " + endRow);

					int startColumn = t.getStartCellReference().getCol();
					int endColumn = t.getEndCellReference().getCol();

					System.out.println("startColumn = " + startColumn);
					System.out.println("endColumn = " + endColumn);

					for (int i = startRow; i <= endRow; i++) {
						String cellVal = "";

						for (int j = startColumn; j <= endColumn; j++) {
							XSSFCell cell = workbook.getSheet(sheetName).getRow(i).getCell(j);
							if (cellVal != null) {
								cellVal = cell.getStringCellValue();
							}
							System.out.print(cellVal + "\t");
						}
						System.out.println();
					}
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}