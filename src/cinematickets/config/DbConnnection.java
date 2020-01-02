/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematickets.config;
import java.sql.*;
import com.mysql.jdbc.Driver;
/**
 *
 * @author udin
 */
public class DbConnnection {
    
    static final String DB_NAME = "e_tickets";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "udin";
    static final String DB_URL = "jdbc:mysql://localhost:3306/"+DB_NAME;
    
    public static Connection getConnection() throws SQLException{
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        
        return connection;
    }
    
}
