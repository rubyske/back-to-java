# Java Control Flow

Kontrol alur program di Java memungkinkan kita menentukan jalannya eksekusi kode berdasarkan kondisi tertentu atau perulangan. Materi ini meliputi **If-Else, Switch, Ternary Operator, Loops (for, while, do-while), dan Break & Continue**.

---

## 1. If-Else Statement

Digunakan untuk mengeksekusi blok kode tertentu berdasarkan kondisi boolean.

```java
int angka = 10;

if (angka > 0) {
    System.out.println("Angka positif");
} else if (angka < 0) {
    System.out.println("Angka negatif");
} else {
    System.out.println("Angka nol");
}
```

Penjelasan:

* **if** digunakan untuk memeriksa kondisi pertama.

* **else if** digunakan untuk memeriksa kondisi tambahan.

* **else**  dijalankan jika semua kondisi sebelumnya salah.

## 2. Switch Statement

Digunakan untuk mengecek nilai variabel terhadap beberapa kasus.

```java
switch (hari) {
case 1:
System.out.println("Senin");
break;
case 2:
System.out.println("Selasa");
break;
case 3:
System.out.println("Rabu");
break;
default:
System.out.println("Hari tidak valid");
break;
}
```
Penjelasan:

* **case** digunakan untuk setiap kemungkinan nilai.

* **break** menghentikan eksekusi case berikutnya.

* **default**  dijalankan jika tidak ada case yang cocok.

## 3. Ternary Operator

Operator singkat untuk if-else sederhana.

```java
int nilai = 75;
String hasil = (nilai >= 60) ? "Lulus" : "Tidak Lulus";
System.out.println(hasil);
```
Penjelasan:

* Bentuk umum: **kondisi ? nilaiJikaTrue : nilaiJikaFalse;**

* Cocok untuk kondisi sederhana dan mengembalikan nilai.

## 4. Loops

Digunakan untuk mengeksekusi blok kode berulang kali.

### 4.1 For Loop
```java
for (int i = 1; i <= 5; i++) {
        System.out.println("Perulangan ke-" + i);
}
```
### 4.2 While Loop
```java
int i = 1;
while (i <= 5) {
        System.out.println("Perulangan ke-" + i);
i++;
}
```
### 4.3 Do While Loop
```java
int i = 1;
do {
        System.out.println("Perulangan ke-" + i);
i++;
        } while (i <= 5);
```
Penjelasan:

* **for** cocok jika jumlah perulangan sudah diketahui.

* **while** memeriksa kondisi terlebih dahulu sebelum eksekusi.

* **do-while** selalu mengeksekusi minimal satu kali sebelum memeriksa kondisi.

## 5. Break & Continue

Digunakan untuk mengontrol alur perulangan.

```java
// Break
for (int i = 1; i <= 5; i++) {
        if (i == 3) break; // Hentikan perulangan saat i = 3
        System.out.println(i);
}

// Continue
        for (int i = 1; i <= 5; i++) {
        if (i == 3) continue; // Lewati perulangan saat i = 3
        System.out.println(i);
}
```
Penjelasan:

* **break** menghentikan seluruh perulangan.

* **continue** melewati iterasi saat ini dan lanjut ke iterasi berikutnya

# Soal Latihan Logika

1. Buat program yang membaca angka dari 1–20, cetak "Fizz" jika angka habis dibagi 3, "Buzz" jika habis dibagi 5, dan "FizzBuzz" jika habis dibagi 3 dan 5.

2. Buat loop for untuk menampilkan angka genap dari 2 hingga 20, tapi lewati angka 10 menggunakan continue.

3. Buat program menggunakan switch yang membaca hari (1–7) dan menampilkan nama hari. Tambahkan default untuk menangani input tidak valid.
