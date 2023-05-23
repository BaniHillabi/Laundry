package com.mycompany.laundry;

import java.util.ArrayList;

public class Petugas implements User {

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Petugas() {
        this.namaPetugas.add("Wildan");
        this.alamat.add("Sawojajar");
        this.telepon.add("082319230280");
        this.jabatan.add(1);

        this.namaPetugas.add("Piss");
        this.alamat.add("Disini");
        this.telepon.add("082319230280");
        this.jabatan.add(2);

    }

    public void setJabatan(int jabatan) {
        this.jabatan.add(jabatan);
    }

    public int getJabatan(int jabatan) {
        return this.jabatan.get(jabatan);
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();
    }

    @Override
    public String getAlamat(int alamat) {
        return this.alamat.get(alamat);
    }

    @Override
    public String getNama(int nama) {
        return this.namaPetugas.get(nama);
    }

    @Override
    public String getTelepon(int telp) {
        return null;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setTelepon(String telp) {
        this.telepon.add(telp);
    }

    public int getJmlPt() {
        return this.namaPetugas.size();
    }
}
