# Hari 1: Java Basic - Hello World & Struktur Program

## Pendahuluan

Hari pertama fokus pada pengenalan Java, memahami sejarah, dan mencoba program pertama: Hello World. Materi ini penting sebagai fondasi untuk semua topik Java berikutnya.

---

## Sejarah Java

* Dikembangkan oleh Sun Microsystems pada tahun 1995.
* Dirancang sebagai bahasa pemrograman yang **portabel**, **object-oriented**, dan **aman**.
* Dikenal dengan slogan **"Write Once, Run Anywhere (WORA)"**.

---

## JVM, JDK, dan JRE

* **JVM (Java Virtual Machine)**: Menjalankan bytecode Java di berbagai platform.
* **JDK (Java Development Kit)**: Paket lengkap untuk menulis, compile, dan menjalankan program Java.
* **JRE (Java Runtime Environment)**: Paket untuk menjalankan program Java (hanya runtime, tanpa compiler).

---

## Hello World Program

Program pertama yang sederhana untuk menampilkan teks di console.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

**Penjelasan:**

* `public class Main`: mendeklarasikan class bernama Main.
* `public static void main(String[] args)`: method utama yang dijalankan saat program mulai.
* `System.out.println()`: menampilkan teks di console.

---

## Struktur Program Java

Struktur minimal program Java:

1. **Class**: semua kode Java berada di dalam class.
2. **Method**: fungsi/fungsi yang melakukan aksi tertentu.
3. **Statements**: perintah eksekusi di dalam method.

Contoh lengkap:

```java
public class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
```

---

## Komentar di Java

Komentar berguna untuk mendokumentasikan kode.

* **Single-line comment:** `// Ini komentar single line`
* **Multi-line comment:**

```java
/*
   Ini komentar
   multi-line
*/
```

* **Documentation comment (JavaDoc):**

```java
/**
 * Ini komentar JavaDoc
 * Digunakan untuk dokumentasi
 */
```

---

## Compile & Run Program Java

1. Simpan file sebagai `Main.java`.
2. Buka terminal dan arahkan ke folder file.
3. Compile:

```
javac Main.java
```

4. Jalankan:

```
java Main
```

5. Output: `Hello World!`

---

## Kesimpulan

Hari pertama ini bertujuan untuk:

* Memahami sejarah dan tujuan Java.
* Mengenal JVM, JDK, dan JRE.
* Membuat program Hello World.
* Memahami struktur program dasar dan komentar.
* Menjalankan program Java dari terminal.

Dengan pemahaman ini, kita siap lanjut ke materi Hari 2: Variabel & Tipe Data.
