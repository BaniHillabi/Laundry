package com.mycompany.laundry;

import java.util.ArrayList;

public class JenisLaundy {

    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundy() {
        this.jenisLaundry.add("0. Cepat");
        this.harga.add(30000);
        this.durasi.add(5); // Per-kg
        this.jenisLaundry.add("1. lambat");
        this.harga.add(20000);
        this.durasi.add(10); // Per-kg
    }

    public String getJL(int index) {
        return this.jenisLaundry.get(index);
    }

    public int getHarga(int index) {
        return this.harga.get(index);
    }

    public int getDurasi(int index) {
        return this.durasi.get(index);
    }

    public void lpLaundry() {
        System.out.println("======= LaundryKilat ~ Info Laundry =======");
        for (int i = 0; i < this.jenisLaundry.size(); i++) {
            System.out.println("Jenis Laundry   : " + this.getJL(i) +
                    "\nHarga        : " + this.getHarga(i) +
                    "\nDurasi       : " + this.getDurasi(i));
        }
    }

}
