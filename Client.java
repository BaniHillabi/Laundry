package com.mycompany.laundry;

import java.util.ArrayList;

public class Client implements User {

    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {
        // Client 1
        this.namaClient.add("Ibani");
        this.alamat.add("Sawojajar");
        this.saldo.add(1000000);
        this.telepon.add("081231240293");
        // Client 2
        this.namaClient.add("Asep");
        this.alamat.add("Tuban");
        this.saldo.add(1500000);
        this.telepon.add("081923872817");
        // Client 3
        this.namaClient.add("Asep");
        this.alamat.add("Tuban");
        this.saldo.add(2000000);
        this.telepon.add("081923872817");
    }

    public void setSaldo(int saldo) {
        this.saldo.add(saldo);
    }

    public int getSaldo(int saldo) {
        return this.saldo.get(saldo);
    }

    @Override
    public void setNama(String nama) {
        this.namaClient.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telp) {
        this.telepon.add(telp);
    }

    @Override
    public String getNama(int nama) {
        return this.namaClient.get(nama);
    }

    @Override
    public String getAlamat(int alamat) {
        return this.alamat.get(alamat);
    }

    @Override
    public String getTelepon(int telp) {
        return this.telepon.get(telp);
    }

    public int getJmlCl() {
        return this.namaClient.size();
    }

}
