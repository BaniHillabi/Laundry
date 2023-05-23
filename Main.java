package com.mycompany.laundry;

public class Main {

    public static void main(String[] args) {
        Transaksi transaksi = new Transaksi();
        JenisLaundy jenislaundry = new JenisLaundy();
        Petugas petugas = new Petugas();
        Client client = new Client();
        laporan lp = new laporan();

        lp.report(client);
        lp.report(petugas);
        jenislaundry.lpLaundry(); // Menampilkan semua info Laundry
        transaksi.inputTransaksi(); // Bagian Input dari Transaksi
        transaksi.prosesTransaksi(client, jenislaundry); // Bagian proses dari transaksi
        transaksi.laporanAkhir(client, jenislaundry); // Akhir dari Proses transaksi
    }
}
