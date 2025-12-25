package main.java.com.phase1.day04;

public class Soal02 {
    /*
      Soal Overloading
        Buat method calculateArea:
            Persegi → 1 parameter (int sisi)
            Persegi panjang → 2 parameter (int panjang, int lebar)
            Lingkaran → 1 parameter (double radius)
    */

    public void calculateArea(int sisi){
        int result = sisi * sisi;
        System.out.println("sisi * sisi = " + result);
    }

    public void calculateArea(int panjang, int lebar) {
        int result = panjang * lebar;
        System.out.println("Panjang * lebar = " + result);
    }

//    public void calculateArea(double radius){
//        System.out.println(radius);
//    }

    public static void main(String[] args) {
        Soal02 persegi = new Soal02();
        persegi.calculateArea(4);

        Soal02 persegiPanjang =  new Soal02();
        persegiPanjang.calculateArea(10, 5);

    }
}
