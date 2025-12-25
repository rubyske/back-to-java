package main.java.com.phase1.day04;

public class Soal03 {
    /*Soal Recursion
        Buat method recursive:
            nama: sumToN
            parameter: int n
            return jumlah angka dari 1 sampai n
*/
    public int sumTon(int n){
        if (n == 0) {
            return 0;
        }
        return n + sumTon(n -1);
    }

    public static void main(String[] args) {
        Soal03 value = new Soal03();
        int result =  value.sumTon(11);
        System.out.println(result);
    }
}
