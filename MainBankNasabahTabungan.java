/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author TK1A - Taufik permana
 */
public class MainBankNasabahTabungan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Bank bank = new Bank();
        System.out.print("Nasabah 1 = ");
        String nama1 = in.nextLine();
        bank.tambahNasabah(nama1, "");

        System.out.print("Nasahab 2 = ");
        String nama2 = in.nextLine();
        System.out.print("Saldo Awal " +nama2 + " = ");
        int saldoAwal = in.nextInt();
        in.nextLine();

        Tabungan tabunganNasabah2 = new Tabungan(saldoAwal);
        bank.tambahNasabah(nama2, "", tabunganNasabah2);

        System.out.println("\nJumlah Nasabah di Bank: " + bank.getJumlahNasabah());

        Nasabah nasabah1 = bank.getNasabah(0);
        Nasabah nasabah2 = bank.getNasabah(1);

        System.out.println("Nasabah 1: " +nasabah1);
        System.out.println("Nasabah 2: " +nasabah2);

        System.out.print("\nSaldo Awal " + nama1 + " = ");
        int saldoTabungan1 = in.nextInt();
        in.nextLine();

        Tabungan tabunganNasabah1 = new Tabungan(saldoTabungan1);
        nasabah1.setTabungan(tabunganNasabah1);
        System.out.println(nama1 + " Tabungannya Sekarang" +nasabah1);

        System.out.print("\nMasukkan jumlah uang yang ingin disimpan oleh " + nama1 + ": ");
        int simpanUang = in.nextInt();
        in.nextLine();
        tabunganNasabah1.simpanUang(simpanUang);
        System.out.println("Saldo " + nama1 + " setelah menabung: " + tabunganNasabah1.getSaldo());

        System.out.print("\nMasukkan jumlah uang yang ingin ditarik oleh " + nama2 + ": ");
        int tarikUang = in.nextInt();
        in.nextLine();
        boolean berhasilTarik = tabunganNasabah2.ambilUang(tarikUang);
        System.out.println(nama2 + " menarik uang: " + (berhasilTarik ? "Berhasil" : "Gagal"));
        System.out.println("Saldo " + nama2 + " setelah penarikan: " + tabunganNasabah2.getSaldo());

        System.out.print("\nMasukkan jumlah uang yang ingin ditransfer dari " + nama1 + " ke " + nama2 + ": ");
        int transferUang = in.nextInt();
        in.nextLine();
        boolean berhasilTransfer = tabunganNasabah1.transfer(tabunganNasabah2, transferUang);
        System.out.println(nama1 + " mentransfer uang ke " + nama2 + ": " + (berhasilTransfer ? "Berhasil" : "Gagal"));
        System.out.println("Saldo " + nama1 + " setelah transfer: " + tabunganNasabah1.getSaldo());
        System.out.println("Saldo " + nama2 + " setelah menerima transfer: " + tabunganNasabah2.getSaldo());
    }
}