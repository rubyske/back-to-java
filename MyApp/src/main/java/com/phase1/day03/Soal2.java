package main.java.com.phase1.day03;

public class Soal2 {
    // Buat loop for untuk menampilkan angka genap dari 2 hingga 20, tapi lewati angka 10 menggunakan continue.
    public static void main(String[] args) {
        for (int i = 2 ; i <= 20 ; i++) {
            if (i % 2 == 0) {
                if (i == 10) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
