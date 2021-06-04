/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini1;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ADVAIT
 */
public class JConnection {
    
    public static Connection ConnectDb(){
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/java_movie","root","");
           System.out.println("Connected");
           return conn;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
                
    }
    
}
