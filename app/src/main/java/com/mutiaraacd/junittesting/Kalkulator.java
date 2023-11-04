package com.mutiaraacd.junittesting;

public class Kalkulator {
    public int add(int a, int b) { // Method untuk menambahkan 2 angka
        return a + b;
    }

    public int subtract(int a, int b) { // Method untuk mengurangkan 2 angka
        return a - b;
    }

    public int multiply(int a, int b) { // Method untuk mengalikan 2 angka
        return a * b;
    }

    public double divide(int a, int b) { // Method untuk membagi 2 angka
        if (b == 0) {
            throw new IllegalArgumentException("Tidak bisa melakukan pembagian dengan nol.");
        }
        return (double) a / b; // Menggunakan pembagian floating-point untuk mendapatkan hasil desimal
    }
}
