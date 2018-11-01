/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Xoi
 */
public class Item {
    
    private int id;
    private int storeid;
    private int sold;
    private Double stars;
    private String name;
    private String about;
    private Double price;
    private byte[] foto, foto1, foto2, foto3, foto4;

    public Item() {
    }

    public Item(int id, int storeid, int sold, Double stars, String name, String about, Double price, byte[] foto, byte[] foto1, byte[] foto2, byte[] foto3, byte[] foto4) {
        this.id = id;
        this.storeid = storeid;
        this.sold = sold;
        this.stars = stars;
        this.name = name;
        this.about = about;
        this.price = price;
        this.foto = foto;
        this.foto1 = foto1;
        this.foto2 = foto2;
        this.foto3 = foto3;
        this.foto4 = foto4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStoreid() {
        return storeid;
    }

    public void setStoreid(int storeid) {
        this.storeid = storeid;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public Double getStars() {
        return stars;
    }

    public void setStars(Double stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public byte[] getFoto1() {
        return foto1;
    }

    public void setFoto1(byte[] foto1) {
        this.foto1 = foto1;
    }

    public byte[] getFoto2() {
        return foto2;
    }

    public void setFoto2(byte[] foto2) {
        this.foto2 = foto2;
    }

    public byte[] getFoto3() {
        return foto3;
    }

    public void setFoto3(byte[] foto3) {
        this.foto3 = foto3;
    }

    public byte[] getFoto4() {
        return foto4;
    }

    public void setFoto4(byte[] foto4) {
        this.foto4 = foto4;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + this.storeid;
        hash = 59 * hash + this.sold;
        hash = 59 * hash + Objects.hashCode(this.stars);
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.about);
        hash = 59 * hash + Objects.hashCode(this.price);
        hash = 59 * hash + Arrays.hashCode(this.foto);
        hash = 59 * hash + Arrays.hashCode(this.foto1);
        hash = 59 * hash + Arrays.hashCode(this.foto2);
        hash = 59 * hash + Arrays.hashCode(this.foto3);
        hash = 59 * hash + Arrays.hashCode(this.foto4);
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
        final Item other = (Item) obj;
        return true;
    }
    
    
    
}
