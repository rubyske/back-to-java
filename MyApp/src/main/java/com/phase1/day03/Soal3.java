package main.java.com.phase1.day03;

import java.util.Scanner;

public class Soal3 {
    //Buat program menggunakan switch yang membaca hari (1–7) dan menampilkan nama hari. Tambahkan default untuk menangani input tidak valid.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Angka 1 - 7 : ");
        int value = scanner.nextInt();

        switch (value) {
            case 1 :
                System.out.println("Senin");
            break;
            case 2 :
                System.out.println("Selasa");
            break;
            case 3 :
                System.out.println("Rabu");
            break;
            case 4 :
                System.out.println("Kamis");
            break;
            case 5 :
                System.out.println("Jum'at");
            break;
            case 6 :
                System.out.println("Sabtu");
            break;
            case 7 :
                System.out.println("Minggu");
            break;
            default:
                System.out.println("Format angka yang kamu masukan tidak valid");

        }
    }

}
