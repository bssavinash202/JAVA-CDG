package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcexamples";
		String username = "root";
		String password = "root";
		String insertQuery = "insert into students(name,age) values('supriya',23)";
		String select = "select*from students";
		String updateQuery = "update students set name = 'supps' where age = 23";
		String deleteQuery = "delete from students where id = 3";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2 : connect to MySQL DB Server
			Connection connection = DriverManager.getConnection(url, username, password);

			// step 3 : create a statement to perform a database operation
			Statement statement = connection.createStatement();
			
//			boolean result = statement.execute(insertQuery);
			boolean result = statement.execute(select);
			if(result) {
				ResultSet rs = statement.getResultSet();
				while(rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString("name");
					int age = rs.getInt(3);
					System.out.println("ID: "+id+" Name: "+name+" Age: "+age);
				}
			}else {
				int updateCount = statement.getUpdateCount();
				System.out.println(updateCount+" Rows effected");
			}

		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}
}
