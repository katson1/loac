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
import modelo.Item;
import modelo.Store;
import modelo.User;

/**
 *
 * @author Xoi
 */
public class ItemDAO {
    
    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection con;
    private String sql;
    
    
    public int getUsers(Item i) throws ClassNotFoundException, SQLException{
        sql = "SELECT * FROM item WHERE iditem = ?;";
        con = C.cb();
        stmt = con.prepareStatement(sql);
        stmt.setInt(1, i.getId());
        rs = stmt.executeQuery();
        i.setStoreid(rs.getInt("idstore"));
        C.db();
        return i.getStoreid();
    }
    
    public boolean updateNameItem(Item i){
        try {
            sql = "UPDATE item SET name = ? WHERE iditem = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, i.getName());
            stmt.setInt(2, i.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public boolean updateAboutItem(Item i){
        try {
            sql = "UPDATE item SET about = ? WHERE iditem = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, i.getAbout());
            stmt.setInt(2, i.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
}
