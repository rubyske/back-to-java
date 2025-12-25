package main.java.com.phase1.OopBasic.Latihan.Soal03;

import java.util.Scanner;

public class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit gagal: amount harus lebih dari 0");
            return;
        }
        balance += amount;
        System.out.println("Deposit berhasil. Saldo sekarang: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdraw gagal: amount harus lebih dari 0");
            return;
        }

        if (amount > balance) {
            System.out.println("Withdraw gagal: saldo tidak cukup");
            return;
        }

        balance -= amount;
        System.out.println("Withdraw berhasil. Saldo sekarang: " + balance);
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("\n=== MENU TRANSAKSI ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. My Balance");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukan jumlah deposit: ");
                    deposit(scanner.nextDouble());
                    break;

                case 2:
                    System.out.print("Masukan jumlah withdraw: ");
                    withdraw(scanner.nextDouble());
                    break;

                case 3:
                    System.out.println("Saldo anda: " + getBalance());
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

            System.out.print("\nApakah kamu ingin melakukan transaksi lagi? (y/n): ");
            ulang = scanner.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih telah menggunakan layanan kami ✨");
    }


    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.process();
    }
}
