package pkg_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCConnection {

	public static void main(String args[]) {
		// Creating the connection
		String url = "jdbc:mysql://localhost:3306/demo";
		String user = "system";
		String pass = "12345";

		// Inserting data using SQL query
		// String sql1 = "insert into student1 values('" + name + "'," + roll + ",'" +
		// cls + "')";
		String sql = "Select From student1";
		Connection con = null;
		try {

			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();
			ResultSet m = st.executeQuery(sql);
			con.close();
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}


