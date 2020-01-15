package exceldriven;

public class callmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Access the Value from Emp_Data Sheet 1st Employee Surname
		TestData td = new TestData();
		td.getDataFromTestDataFile( "Emp_Data", 2, 3);
		//Data_Tables
		
		td.getTableDataFromTestDataFileAndVerify("Data_Tables","emp_Table");
	}
}
