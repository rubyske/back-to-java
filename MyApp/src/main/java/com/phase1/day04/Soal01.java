package main.java.com.phase1.day04;

public class Soal01 {
    /*
    Soal Method & Return
    Buat method:
        nama: isEven
        parameter: int number
        return: boolean
        return true jika genap, false jika ganjil
        Tanpa print di dalam method
     */
    public boolean isEven(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Soal01 even = new Soal01();
        for (int i = 0; i <= 20; i++){
            System.out.println(even.isEven(i));
        }
    }
}
