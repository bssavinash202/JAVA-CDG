package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBCDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/jdbcexamples";
		String username = "root";
		String password = "root";
		String insertQuery = "insert into students(name,age) values('sai',23)";
		String select = "select*from students";
		String updateQuery = "update students set name = 'supes' where age = 23";
		String deleteQuery = "delete from students where id = 3";
		try {
			// step 1 : Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2 : connect to MySQL DB Server
			Connection connection = DriverManager.getConnection(url, username, password);

			// step 3 : create a statement to perform a database operation
			Statement statement = connection.createStatement();

			//step 4: run the statement
			statement.executeUpdate(insertQuery);
			System.out.println("data inserted");
			
			//retrieve the inserted data from table.
			
			System.out.println("select operation");
			ResultSet rs = statement.executeQuery(select);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString("name");
				int age = rs.getInt(3);
				System.out.println("ID: "+id+" Name: "+name+" Age: "+age);
			}
			
			System.out.println("Update Operation");
			int rowsUpdated = statement.executeUpdate(updateQuery);
			if(rowsUpdated>0) {
				System.out.println(rowsUpdated+" rows updated");
			}
			ResultSet rs2 = statement.executeQuery(select);
			while(rs2.next()) {
				int id = rs2.getInt(1);
				String name = rs2.getString("name");
				int age = rs2.getInt(3);
				System.out.println("ID: "+id+" Name: "+name+" Age: "+age);
			}
			
			System.out.println("delete operation");
			
			int rowsUpdated2 = statement.executeUpdate(deleteQuery);
			if(rowsUpdated2>0) {
				System.out.println(rowsUpdated2+" rows deleted");
			}
			ResultSet rs3 = statement.executeQuery(select);
			while(rs3.next()) {
				int id = rs3.getInt(1);
				String name = rs3.getString("name");
				int age = rs3.getInt(3);
				System.out.println("ID: "+id+" Name: "+name+" Age: "+age);
			}
			// step 5 : closing the statements and connection
			rs.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
