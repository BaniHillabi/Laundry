package com.mycompany.laundry;

public class laporan {

    public void report(Client client) {
        int x = client.getJmlCl();
        System.out.println("======= LaundryKilat ~ Info CLient=======");
        for (int i = 0; i < x; i++) {
            System.out.println("Member " + (i) + "       :" + client.getNama(i)
                    + "\nAlamat         : " + client.getAlamat(i)
                    + "\nNo. telp       : " + client.getTelepon(i)
                    + "\nSaldo          : " + client.getSaldo(i));
            System.out.println();
        }
    }

    public void report(Petugas petugas) {
        int x = petugas.getJmlPetugas();
        System.out.println("======= LaundryKilat ~ Info Petugas=======");
        for (int i = 0; i < x; i++) {
            System.out.println("Member " + (i) + " :" + petugas.getNama(i)
                    + "\nAlamat         : " + petugas.getAlamat(i)
                    + "\nNo. telp       : " + petugas.getTelepon(i));
            System.out.println();
        }
    }
}
