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
import modelo.User;

/**
 *
 * @author Xoi
 */
public class UserDAO {
    
    private PreparedStatement stmt;
    private ResultSet rs;
    private Connection con;
    private String sql;
    
    public List<User> getUsers() throws ClassNotFoundException, SQLException{
        List<User> usuarios = new ArrayList<>();
        User u = null;
        sql = "SELECT * FROM user;";
        con = C.cb();
        stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while(rs.next()){
            u = new User();
            u.setId(rs.getInt("iduser"));
            u.setName(rs.getString("name"));
            u.setPass(rs.getString("pass"));
            
            usuarios.add(u);
        }
        C.db();
        return usuarios;
    }
    
    public boolean insertUsers(User u){
        try {
            sql = "INSERT INTO user (name,pass) VALUES (?,?);";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, u.getName());
            stmt.setString(2, u.getPass());
            stmt.execute();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    //*******
    //UPDATES
    //*******
    public boolean updateNameUser(User u){
        try {
            sql = "UPDATE user SET name = ? WHERE iduser = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, u.getName());
            stmt.setInt(2, u.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
        
    public boolean updatePassUser(User u){
        try {
            sql = "UPDATE user SET pass = ? WHERE iduser = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, u.getPass());
            stmt.setInt(2, u.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public boolean updateCpfUser(User u){
        try {
            sql = "UPDATE user SET cpf = ? WHERE iduser = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, u.getCpf());
            stmt.setInt(2, u.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public boolean updateEmailUser(User u){
        try {
            sql = "UPDATE user SET email = ? WHERE iduser = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, u.getEmail());
            stmt.setInt(2, u.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public boolean updateEndUser(User u){
        try {
            sql = "UPDATE user SET end = ? WHERE iduser = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setString(1, u.getEnd());
            stmt.setInt(2, u.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public boolean updateLPUser(User u){
        try {
            sql = "UPDATE user SET loacpoints = ? WHERE iduser = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setInt(1, u.getLoacpoint());
            stmt.setInt(2, u.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    public boolean updateFotoUser(User u){
        try {
            sql = "UPDATE user SET foto = ? WHERE iduser = ?;";
            con = C.cb();
            stmt = con.prepareCall(sql);
            stmt.setBytes(1, u.getFoto());
            stmt.setInt(2, u.getId());
            stmt.executeUpdate();
            C.db();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    
    
    public boolean deleteUsers(int id ){
        try {
            sql = "DELETE FROM user WHERE iduser = ?";
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
