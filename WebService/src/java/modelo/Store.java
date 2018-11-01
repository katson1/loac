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
public class Store {
    
    private int id;
    private int storekey;
    private String name;
    private String pass;
    private String cnpj;
    private String email;
    private String end;
    private String about;
    private String stars;
    private Double total;
    private byte[] foto;

    public Store() {
    }

    public Store(int id, int storekey, String name, String pass, String cnpj, 
            String email, String end, String about, String stars, Double total,
            byte[] foto) {
        this.id = id;
        this.storekey = storekey;
        this.name = name;
        this.pass = pass;
        this.cnpj = cnpj;
        this.email = email;
        this.end = end;
        this.about = about;
        this.stars = stars;
        this.total = total;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStorekey() {
        return storekey;
    }

    public void setStorekey(int storekey) {
        this.storekey = storekey;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
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
        hash = 29 * hash + this.id;
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
        final Store other = (Store) obj;
        return true;
    }
    
    
    
}
