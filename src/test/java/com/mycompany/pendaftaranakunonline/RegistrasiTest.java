/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pendaftaranakunonline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class RegistrasiTest {
    
    @Test
    public void testValidasiUsername_BatasBawahValid() {
        Registrasi akun = new Registrasi();
        String input = "abcde";
        boolean expected = true;
        boolean actual = akun.validasiUsername(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidasiPassword_TerlaluPendek() {
        Registrasi akun = new Registrasi();
        String input = "1234567";
        boolean expected = false;
        boolean actual = akun.validasiPassword(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidasiUsia_BatasAtasValid() {
        Registrasi akun = new Registrasi();
        int input = 60;
        boolean expected = true;
        boolean actual = akun.validasiUsia(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidasiBio_MelebihiBatas() {
        Registrasi akun = new Registrasi();
        String input = "a".repeat(101);
        boolean expected = false;
        boolean actual = akun.validasiBio(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidasiJumlahHobi_BatasBawahValid() {
        Registrasi akun = new Registrasi();
        int input = 1;
        boolean expected = true;
        boolean actual = akun.validasiJumlahHobi(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidasiTahunLahir_TerlaluTua() {
        Registrasi akun = new Registrasi();
        int input = 1960;
        boolean expected = false;
        boolean actual = akun.validasiTahunLahir(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidasiGaji_TepatBatasAtas() {
        Registrasi akun = new Registrasi();
        double input = 100.0;
        boolean expected = true;
        boolean actual = akun.validasiGaji(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidasiNomorTelepon_Pendek() {
        Registrasi akun = new Registrasi();
        String input = "08123";
        boolean expected = false;
        boolean actual = akun.validasiNomorTelepon(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidasiKodePos_Valid() {
        Registrasi akun = new Registrasi();
        String input = "40286";
        boolean expected = true;
        boolean actual = akun.validasiKodePos(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testValidasiNamaDepan_KarakterMinimum() {
        Registrasi akun = new Registrasi();
        String input = "Ra";
        boolean expected = true;
        boolean actual = akun.validasiNamaDepan(input);
        assertEquals(expected, actual);
    }
    
}
