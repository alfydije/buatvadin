package com.example.application.data.entity;

import javax.persistence.Entity;

@Entity
public class DataProduk extends AbstractEntity{

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Name;

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String harga) {
        Harga = harga;
    }

    private String Harga;

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }

    private byte[] gambar;



}
