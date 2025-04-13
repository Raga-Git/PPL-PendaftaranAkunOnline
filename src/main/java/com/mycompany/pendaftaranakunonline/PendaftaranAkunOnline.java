/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pendaftaranakunonline;

import java.util.Scanner;


public class PendaftaranAkunOnline {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selamat Datang");
        System.out.println("Silahkan Melakukan Pendaftaran Akun terlebih dahulu");
        System.out.println("Isilah data anda dengan benar\n");
        
        // Username
        System.out.print("Username (5-15 karakter): ");
        String username = input.nextLine();
        if (!Registrasi.validasiUsername(username)) {
            System.out.println("Username tidak valid.");
        }

        // Password
        System.out.print("Password (8-20 karakter): ");
        String password = input.nextLine();
        if (!Registrasi.validasiPassword(password)) {
            System.out.println("Password tidak valid.");
        }

        // Usia
        System.out.print("Usia (18-60): ");
        int usia = input.nextInt();
        if (!Registrasi.validasiUsia(usia)) {
            System.out.println("Usia tidak valid.");
        }

        input.nextLine(); // clear buffer

        // Bio
        System.out.print("Bio singkat (max 100 karakter): ");
        String bio = input.nextLine();
        if (!Registrasi.validasiBio(bio)) {
            System.out.println("Bio terlalu panjang.");
        }

        // Hobi
        System.out.print("Jumlah hobi (1-3): ");
        int hobi = input.nextInt();
        if (!Registrasi.validasiJumlahHobi(hobi)) {
            System.out.println("Jumlah hobi tidak valid.");
        }

        // Tahun lahir
        System.out.print("Tahun lahir (1965-2007): ");
        int tahun = input.nextInt();
        if (!Registrasi.validasiTahunLahir(tahun)) {
            System.out.println("Tahun lahir tidak valid.");
        }

        // Gaji
        System.out.print("Gaji bulanan (juta, 1-100): ");
        double gaji = input.nextDouble();
        if (!Registrasi.validasiGaji(gaji)) {
            System.out.println("Gaji bulanan tidak valid.");
        }

        input.nextLine(); // clear buffer

        // Nomor telepon
        System.out.print("Nomor telepon (10-13 digit): ");
        String noTelp = input.nextLine();
        if (!Registrasi.validasiNomorTelepon(noTelp)) {
            System.out.println("Nomor telepon tidak valid.");
        }

        // Kode pos
        System.out.print("Kode pos (5 digit): ");
        String kodePos = input.nextLine();
        if (!Registrasi.validasiKodePos(kodePos)) {
            System.out.println("Kode pos tidak valid.");
        }

        // Nama depan
        System.out.print("Nama depan (2-30 karakter): ");
        String nama = input.nextLine();
        if (!Registrasi.validasiNamaDepan(nama)) {
            System.out.println("Nama depan tidak valid.");
        }

        System.out.println("\nTerima kasih telah mendaftar!");
        input.close();
    
    }
}
