package com.mutiaraacd.junittesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class KalkulatorTest {

    @Test
    public void twoPlusTwoShouldEqualFour() {
        // Membuat instance dari kelas Kalkulator untuk diuji
        Kalkulator kalkulator = new Kalkulator();

        // Memanggil metode add dari Kalkulator dengan argumen 20 dan 5
        int result = kalkulator.add(20, 5);

        // Membandingkan hasil perhitungan dengan nilai yang diharapkan
        // Jika hasil sama dengan 25, pengujian akan berhasil
        assertEquals(25, result);
    }
}
