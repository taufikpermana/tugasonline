package Praktikum10042025;

import java.util.Scanner;

public class TestNasabah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Awal: ");
        String namaAwal = input.nextLine();
        System.out.print("Nama Akhir: ");
        String namaAkhir = input.nextLine();

        Nasabah nasabah = new Nasabah(namaAwal, namaAkhir);

        System.out.print("Saldo Awal: ");
        int saldoAwal = input.nextInt();
        
        Tabungan tabungan = new Tabungan(saldoAwal);
        nasabah.setTabungan(tabungan);

        System.out.println("\nInfo Nasabah: " + nasabah);

        int menu;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Simpan Uang");
            System.out.println("3. Ambil Uang");
            System.out.println("4. Keluar");
            System.out.print("Pilih (1-4): ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo saat ini: " + tabungan.getSaldo());
                    break;

                case 2:
                    System.out.print("Masukkan jumlah yang ingin disimpan: ");
                    int jumlahSimpan = input.nextInt();
                    if (jumlahSimpan > 0) {
                        tabungan.simpanUang(jumlahSimpan);
                        System.out.println("Uang berhasil disimpan.");
                    } else {
                        System.out.println("Jumlah simpan harus lebih dari 0.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan jumlah yang ingin diambil: ");
                    int jumlahAmbil = input.nextInt();
                    if (jumlahAmbil > 0) {
                        if (tabungan.ambilUang(jumlahAmbil)) {
                            System.out.println("Uang berhasil diambil.");
                        } else {
                            System.out.println("Saldo tidak cukup.");
                        }
                    } else {
                        System.out.println("Jumlah ambil harus lebih dari 0.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (menu != 4);

        input.close();
    }
}