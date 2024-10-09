import java.sql.*;
import java.lang.*;
public class W11_P5 {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();

// Write the SQL command to rename a table
String alter="ALTER TABLE STUDENTS RENAME TO GRADUATES;";
// Execute the SQL command
stmt.executeUpdate(alter);

}   catch(Exception e){ System.out.println(e);}  
    }
}
