/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pendaftaranakunonline;

/**
 *
 * @author LENOVO
 */
public class Registrasi {
    public static boolean validasiUsername(String username) {
        return username.length() >= 5 && username.length() <= 15;
    }

    public static boolean validasiPassword(String password) {
        return password.length() >= 8 && password.length() <= 20;
    }

    public static boolean validasiUsia(int usia) {
        return usia >= 18 && usia <= 60;
    }

    public static boolean validasiBio(String bio) {
        return bio.length() <= 100;
    }

    public static boolean validasiJumlahHobi(int jumlah) {
        return jumlah >= 1 && jumlah <= 3;
    }

    public static boolean validasiTahunLahir(int tahun) {
        return tahun >= 1965 && tahun <= 2007;
    }

    public static boolean validasiGaji(double gaji) {
        return gaji >= 1 && gaji <= 100;
    }

    public static boolean validasiNomorTelepon(String nomor) {
        return nomor.length() >= 10 && nomor.length() <= 13 && nomor.matches("\\d+");
    }

    public static boolean validasiKodePos(String kodePos) {
        return kodePos.length() == 5 && kodePos.matches("\\d+");
    }

    public static boolean validasiNamaDepan(String nama) {
        return nama.length() >= 2 && nama.length() <= 30;
    }
}
