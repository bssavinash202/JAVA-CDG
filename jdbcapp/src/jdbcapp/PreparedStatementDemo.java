package jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class PreparedStatementDemo {

		public static void main(String[] args) {

			String url = "jdbc:mysql://localhost:3306/jdbcexamples";
			String username = "root";
			String password = "root";
			String insertQuery = "insert into students(name,age) values(?,?)";
			String select = "select*from students where id =?";
			String updateQuery = "update students set name = '?' where age = ?";
			String deleteQuery = "delete from students where id = ?";
			try {
				// step 1 : Register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");

				// step 2 : connect to MySQL DB Server
				Connection connection = DriverManager.getConnection(url, username, password);

				// step 3 : create a statement to perform a database operation
				PreparedStatement preparedstatement = connection.prepareStatement(insertQuery);
				
				preparedstatement.setString(1,"Kumar");
				preparedstatement.setInt(2, 20);
				preparedstatement.executeUpdate();
				
				preparedstatement.setString(1,"Gandu");
				preparedstatement.setInt(2, 30);
				preparedstatement.executeUpdate();
				System.out.println("data inserted");
				
				PreparedStatement selectpreparedstatement = connection.prepareStatement(select);
				selectpreparedstatement.setInt(1, 8);
				ResultSet rs = selectpreparedstatement.executeQuery();
				while(rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString("name");
					int age = rs.getInt(3);
					System.out.println("ID: "+id+" Name: "+name+" Age: "+age);
				}
				
				preparedstatement.close();
				connection.close();
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}


