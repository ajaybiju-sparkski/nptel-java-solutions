import java.sql.*;
import java.lang.*;
public class W11_P4 {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();

// The statement containing SQL command to create table "STUDENTS"
String CREATE_TABLE_SQL="CREATE TABLE STUDENTS (UID INT, Name VARCHAR(45), Roll VARCHAR(12), Age INT);";
// Execute the statement containing SQL command below this comment
stmt.executeUpdate(CREATE_TABLE_SQL);

}
       catch(Exception e){ System.out.println(e);}  
    }
}
