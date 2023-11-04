# JUnitTesting (Kalkulator)

Ini adalah contoh proyek pengujian menggunakan JUnit untuk kelas Kalkulator.

## Kalkulator

Kelas Kalkulator (Kalkulator) merupakan implementasi kalkulator sederhana dengan empat operasi dasar: penambahan, pengurangan, perkalian, dan pembagian.

### Fungsi-fungsi Kalkulator

- add(int a, int b): Method ini digunakan untuk menambahkan dua angka.
- subtract(int a, int b): Method ini digunakan untuk mengurangkan dua angka.
- multiply(int a, int b): Method ini digunakan untuk mengalikan dua angka.
- divide(int a, int b): Method ini digunakan untuk membagi dua angka. Juga melakukan penanganan pembagian dengan nol.

## KalkulatorTest

Kelas KalkulatorTest merupakan kelas pengujian (unit test) untuk menguji fungsionalitas kelas Kalkulator. Pengujian ini menggunakan kerangka pengujian JUnit.

### Unit Test

- testAddition(): Menguji fungsi penambahan.
- testSubtraction(): Menguji fungsi pengurangan.
- testMultiplication(): Menguji fungsi perkalian.
- testDivision(): Menguji fungsi pembagian. Toleransi error digunakan karena hasil pembagian adalah nilai floating-point.
