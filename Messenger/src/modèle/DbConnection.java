/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modèle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lopereira2
 */
public class DbConnection {

    public static Connection Connect(){
        try {
            //Your database url string,ensure it is correct
            String url = "jdbc:mysql://localhost:3306/dblopereira2";
            String user = "root";
            String password = "1234";

            Class.forName("com.mysql.jdbc.Driver");       
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        
    }

}
