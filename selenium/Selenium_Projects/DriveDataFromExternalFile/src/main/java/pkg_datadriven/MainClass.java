package pkg_datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook workbook = null;
		File srcFile = null;

		try {
			srcFile = new File("F:\\selenium\\InfoLeaseProjectData.xlsx");

			FileInputStream fis = new FileInputStream(srcFile);
			workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheetAt(0);
			String Data0 = sheet.getRow(0).getCell(0).getStringCellValue();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block 
			workbook.close();
			e.printStackTrace();

		}

	}

}
