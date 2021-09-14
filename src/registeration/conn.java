/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registeration;
import java.sql.*;

/**
 *
 * @author priyesh
 */
public class conn {
    public static Connection con;
    static{
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-T49D8JG:1433;databaseName=student;user=sa;password=abhishek1@");
            
        }
        catch(Exception e){
            System.out.println("Error occoured"+e);
        }
    }
    
    
}
