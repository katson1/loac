/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Xoi
 */
public class User {
    
    private int id;
    private int userkey;
    private String name;
    private String pass;
    private String cpf;
    private String email;
    private String end;
    private int loacpoint;
    private byte[] foto;
    

    public User() {
    }

    public User(int id, int userkey, String name, String pass, String cpf, 
            String email, String end, int loacpoint, byte[] foto) {
        this.id = id;
        this.userkey = userkey;
        this.name = name;
        this.pass = pass;
        this.cpf = cpf;
        this.email = email;
        this.end = end;
        this.loacpoint = loacpoint;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserkey() {
        return userkey;
    }

    public void setUserkey(int userkey) {
        this.userkey = userkey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getLoacpoint() {
        return loacpoint;
    }

    public void setLoacpoint(int loacpoint) {
        this.loacpoint = loacpoint;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return true;
    }

    
   
    
    
}
