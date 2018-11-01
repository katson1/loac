/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controle.C;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Store;
import modelo.User;

/**
 *
 * @author Xoi
 */
public class StoreDAO {
    
    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection con;
    private String sql;
        
   
    public boolean insertUsers(Store s){
        try {
            sql = "INSERT INTO store (name,pass) VALUES (?,?);";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, s.getName());
            stmt.setString(2, s.getPass());
            stmt.execute();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public boolean updateNameStore(Store s){
        try {
            sql = "UPDATE store SET name = ? WHERE idstore = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, s.getName());
            stmt.setInt(2, s.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
   
    public boolean updatePassStore(Store s){
        try {
            sql = "UPDATE store SET pass = ? WHERE idstore = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, s.getPass());
            stmt.setInt(2, s.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
}
