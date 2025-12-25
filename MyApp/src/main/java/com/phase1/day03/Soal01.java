package main.java.com.phase1.day03;

public class Soal01 {
    /*
     Buat program yang membaca angka dari 1–20, cetak "Fizz" jika angka habis dibagi 3,
     "Buzz" jika habis dibagi 5, dan "FizzBuzz" jika habis dibagi 3 dan 5.
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 20 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
