package main.java.com.phase1.day02;

public class Soal03 {
    // 3. Tulis kode untuk membuat 1 variabel final, lalu coba ubah nilainya dan lihat apa yang terjadi.
    public static void main(String[] args) {
        final int umur = 22 ;
        System.out.println("Umur saya tahun ini " + umur);

    // umur = 23 ; ( Error karena variable umur menggunakan keyword final yang value nya tidak bisa di ubah )
        System.out.println("umur saya tahun depan " + umur);
    }
}
