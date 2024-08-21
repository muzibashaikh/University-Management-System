
package university.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c =DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","miniproject");
       s=c.createStatement();
    
    
    }catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());}
}}
