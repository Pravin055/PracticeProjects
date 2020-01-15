package testcases_project_name;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// variale decarations
		int sheetCount = 0;
		FileInputStream fis;
		XSSFWorkbook workbook;

		// Accesing the files and actual implementation
		fis = new FileInputStream("F:\\selenium\\TestDataWorkBook.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheetCount = workbook.getNumberOfSheets();

		for (int i = 0; i <= sheetCount; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("HP1_TestData")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next(); // Sheet is collection of Rows
				Iterator<Cell> ce = firstRow.cellIterator(); // Rowis collection of cells

				int k = 0;
				int column = 0;

				while (ce.hasNext())

				{
					Cell value = ce.next();

					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;
					}
					k++;

				}
				System.out.println("column : " + column);

				// Once the colums is identified then Scan the entire test case to identify the
				// purchase row

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("purchase")) {
						// Once you find the Purchase test case - Pull all the call valus and feed into
						// test
						Iterator<Cell> cv = r.cellIterator();

						while (cv.hasNext()) {

							System.out.println(cv.next().getStringCellValue());

						}
					}
				}

			}

		}

	}

}
