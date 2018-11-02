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
        
    public List<Store> getStore() throws ClassNotFoundException, SQLException{
        List<Store> stores = new ArrayList<>();
        Store s = null;
        sql = "SELECT * FROM store;";
        con = C.cb();
        stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while(rs.next()){
            s = new Store();
            s.setName(rs.getString("name"));
            s.setFoto(rs.getBytes("foto"));
            
            stores.add(s);
        }
        C.db();
        return stores;
    }
    
    
    public boolean insertStore(Store s){
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
    
    public boolean updateAboutStore(Store s){
        try {
            sql = "UPDATE store SET about = ? WHERE idstore = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, s.getAbout());
            stmt.setInt(2, s.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public boolean updateEmailStore(Store s){
        try {
            sql = "UPDATE store SET about = ? WHERE idstore = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, s.getEmail());
            stmt.setInt(2, s.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public boolean updateEndStore(Store s){
        try {
            sql = "UPDATE store SET end = ? WHERE idstore = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, s.getEnd());
            stmt.setInt(2, s.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public boolean updateFotoStore(Store s){
        try {
            sql = "UPDATE store SET foto = ? WHERE idstore = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setBytes(1, s.getFoto());
            stmt.setInt(2, s.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    
    
    
    ///// DELETE
    public boolean deleteStore(int id ){
        try {
            sql = "DELETE FROM store WHERE idstore = ?";
            con = C.cb();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            C.db();
            deleteItensStore(id);
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean deleteItensStore(int id ){
        try {
            sql = "DELETE FROM item WHERE idstore = ?";
            con = C.cb();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            C.db();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
}
