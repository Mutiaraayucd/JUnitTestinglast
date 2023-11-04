package com.mutiaraacd.junittesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class KalkulatorTest {

    @Test
    public void testAddition() {
        Kalkulator kalkulator = new Kalkulator(); // Membuat objek Kalkulator
        int result = kalkulator.add(15, 7); // Memanggil metode add untuk menguji penambahan
        assertEquals(22, result); // Menggunakan metode assertEquals untuk membandingkan hasil dengan nilai yang diharapkan
    }

    @Test
    public void testSubtraction() {
        Kalkulator kalkulator = new Kalkulator(); // Membuat objek Kalkulator
        int result = kalkulator.subtract(9, 3); // Memanggil metode subtract untuk menguji pengurangan
        assertEquals(6, result); // Menggunakan metode assertEquals untuk membandingkan hasil dengan nilai yang diharapkan
    }

    @Test
    public void testMultiplication() {
        Kalkulator kalkulator = new Kalkulator(); // Membuat objek Kalkulator
        int result = kalkulator.multiply(3, 4); // Memanggil metode multiply untuk menguji perkalian
        assertEquals(12, result); // Menggunakan metode assertEquals untuk membandingkan hasil dengan nilai yang diharapkan
    }

    @Test
    public void testDivision() {
        Kalkulator kalkulator = new Kalkulator(); // Membuat objek Kalkulator
        double result = kalkulator.divide(12, 4); // Memanggil metode divide untuk menguji pembagian
        assertEquals(3.0, result, 0.001); // Menggunakan metode assertEquals untuk membandingkan hasil dengan nilai yang diharapkan. Toleransi error (delta) digunakan karena pembagian adalah operasi floating-point.
    }
}
