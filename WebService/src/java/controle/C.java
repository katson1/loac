/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xoi
 */
public class C {
    
    
    private static final String URL = "jdbc:mysql://localhost:3308/webservice";
    
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String SENHA = "";
    
    private static Connection con;    
    
    public static Connection cb() throws ClassNotFoundException, SQLException{
        Class.forName(DRIVER);
        con = DriverManager.getConnection(URL, USER, SENHA);
        return con;
    }
    
    	static String ip = "127.0.0.1";
	static String porta = "3308";
	static String usuario = "root";
	static String senha = "";
	static String nomeBanco = "prova";
	
    
    public static void db(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(C.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
