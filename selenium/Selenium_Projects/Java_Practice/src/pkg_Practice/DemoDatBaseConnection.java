package pkg_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoDatBaseConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "";
		String user = "";
		String password = "";
		String fetchStudentData = "";
		Connection con = null;

		try {

			con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rst = st.executeQuery(fetchStudentData);
			System.out.println("Printing the fetched Data by query : " + rst);
			
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e);
			con.close();
		}

	}

}
