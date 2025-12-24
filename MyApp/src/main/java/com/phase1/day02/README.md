# Hari 2: Variabel & Tipe Data

## Pendahuluan

Hari kedua fokus pada **variabel dan tipe data** di Java. Materi ini penting karena variabel adalah tempat menyimpan data dan tipe data menentukan jenis informasi yang bisa disimpan. Pemahaman yang baik membantu membuat program lebih efisien dan benar.

---

## Variabel di Java

* **Variabel** adalah lokasi penyimpanan di memori yang diberi nama.
* Setiap variabel memiliki **nama**, **tipe data**, dan **nilai**.

### Deklarasi Variabel

```java
int age;          // deklarasi variabel integer
String name;      // deklarasi variabel string
```

### Inisialisasi Variabel

```java
age = 21;         // memberi nilai awal ke variabel
name = "Badru";  // memberi nilai awal string
```

### Deklarasi dan Inisialisasi Sekaligus

```java
int age = 21;
String name = "Badru";
```

### Aturan Penamaan Variabel

* Tidak boleh dimulai dengan angka.
* Tidak boleh ada spasi.
* Gunakan camelCase untuk nama variabel: `userName`, `totalAmount`.

---

## Tipe Data di Java

Java memiliki dua kategori tipe data: **Primitive** dan **Non-Primitive**.

### Primitive Data Types

| Tipe    | Contoh  | Deskripsi             |
| ------- | ------- | --------------------- |
| byte    | 100     | 8-bit integer         |
| short   | 1000    | 16-bit integer        |
| int     | 100000  | 32-bit integer        |
| long    | 100000L | 64-bit integer        |
| float   | 10.5f   | 32-bit floating point |
| double  | 10.5    | 64-bit floating point |
| char    | 'A'     | 16-bit character      |
| boolean | true    | true/false            |

### Non-Primitive Data Types

* **String**: menyimpan teks.

```java
String greeting = "Hello Java!";
```

* **Arrays, Classes, Interface, Object** termasuk tipe data non-primitive.

---

## Constants

* Digunakan untuk menyimpan nilai yang tidak bisa diubah.
* Dideklarasikan dengan kata kunci `final`.

```java
final double PI = 3.14159;
```

---

## Scope Variabel

* **Local Variable**: di dalam method/block, hanya berlaku di situ.
* **Instance Variable**: di dalam class tapi di luar method, berlaku untuk setiap objek.
* **Static Variable**: di dalam class, berlaku untuk semua objek.

Contoh:

```java
public class Example {
    int instanceVar = 10;        // instance variable
    static int staticVar = 20;   // static variable

    void method() {
        int localVar = 30;       // local variable
    }
}
```

---

## Contoh Program

```java
public class Main {
    public static void main(String[] args) {
        int age = 21;
        String name = "Badru";
        final double PI = 3.14159;

        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("PI: " + PI);
    }
}
```

---

## Soal Test Logika

1. Buatlah program yang mendeklarasikan 3 variabel integer, lalu menampilkan hasil penjumlahan, pengurangan, dan perkalian ketiganya.
2. Buat program untuk menyimpan nama, umur, dan status mahasiswa (boolean). Tampilkan dengan format: "Nama: ..., Umur: ..., Mahasiswa aktif: ...".
3. Tulis kode untuk membuat 1 variabel final, lalu coba ubah nilainya dan lihat apa yang terjadi.
