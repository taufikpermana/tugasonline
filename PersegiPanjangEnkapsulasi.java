/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TK1A - TAUFIK PERMANA
 */
public class PersegiPanjangEnkapsulasi {
private int panjang;
private int lebar;
private static int jumlahObjek = 0;

// Konstruktor default
public PersegiPanjangEnkapsulasi() {
this.panjang = 0;
this.lebar = 0;
jumlahObjek++;
}

// Konstruktor dengan parameter
public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru) {
this.panjang = panjangBaru;
this.lebar = lebarBaru;
jumlahObjek++;
}

// Setter dan getter untuk panjang
public void setPanjang(int panjangBaru) {
this.panjang = panjangBaru;
}

public int getPanjang() {
return panjang;
}

// Setter dan getter untuk lebar
public void setLebar(int lebarBaru) {
this.lebar = lebarBaru;
}

public int getLebar() {
return lebar;
}

// Getter untuk jumlah objek
public static int getJumlahObjek() {
return jumlahObjek;
}

// Method untuk menghitung luas
public int getLuas() {
return panjang * lebar;
}

// Method untuk menghitung keliling
public int getKeliling() {
return 2 * (panjang + lebar);
}
 }