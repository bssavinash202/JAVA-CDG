package jdbcapp;


import java.sql.*;

public class FirstJDBCDemo1 {

    static final String URL = "jdbc:mysql://localhost:3306/jdbcexamples";
    static final String USERNAME = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            // Step 1: Register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create connection
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Perform operations
            insertStudent(connection, "sai", 23);
            selectStudents(connection);

            updateStudentNameByAge(connection, "supes", 23);
            selectStudents(connection);

            deleteStudentById(connection, 3);
            selectStudents(connection);

            // Step 5: Close connection
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to insert a student
    public static void insertStudent(Connection connection, String name, int age) throws SQLException {
        String insertQuery = "INSERT INTO students(name, age) VALUES(?, ?)";
        PreparedStatement ps = connection.prepareStatement(insertQuery);
        ps.setString(1, name);
        ps.setInt(2, age);
        int rows = ps.executeUpdate();
        System.out.println(rows + " row(s) inserted.");
        ps.close();
    }

    // Method to select all students
    public static void selectStudents(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM students";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(selectQuery);
        System.out.println("---- Student Records ----");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
        }
        rs.close();
        statement.close();
    }

    // Method to update student name by age
    public static void updateStudentNameByAge(Connection connection, String newName, int age) throws SQLException {
        String updateQuery = "UPDATE students SET name = ? WHERE age = ?";
        PreparedStatement ps = connection.prepareStatement(updateQuery);
        ps.setString(1, newName);
        ps.setInt(2, age);
        int rows = ps.executeUpdate();
        System.out.println(rows + " row(s) updated.");
        ps.close();
    }

    // Method to delete a student by ID
    public static void deleteStudentById(Connection connection, int id) throws SQLException {
        String deleteQuery = "DELETE FROM students WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(deleteQuery);
        ps.setInt(1, id);
        int rows = ps.executeUpdate();
        System.out.println(rows + " row(s) deleted.");
        ps.close();
    }
}
