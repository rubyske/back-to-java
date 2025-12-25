# 🧠 Soal Latihan OOP Basic & Encapsulation (Java)

Latihan ini dibuat buat ngebentuk **cara berpikir OOP** yang bener.  
Bukan sekadar “kelas ada, object jalan”, tapi **kenapa dibuat begitu**.

---

## 1️⃣ Class & Object

### 🎯 Tujuan
Memahami perbedaan **Class (cetakan)** dan **Object (hasil cetakan)**.  
Belum pakai constructor. Santai dulu.

### 📌 Ketentuan
Buat sebuah class bernama `Car` dengan:
- Attribute:
    - `brand` (String)
    - `year` (int)
- Buat object dari class `Car`
- Isi nilai `brand` dan `year`
- Tampilkan datanya ke console

### 💡 Fokus
- Class = blueprint
- Object = real instance di memori

---

## 2️⃣ Constructor

### 🎯 Tujuan
Object itu **harus valid sejak lahir**.  
Kalau lahirnya aja kosong, ngapain?

### 📌 Ketentuan
Buat class `User` dengan:
- Attribute:
    - `username`
    - `email`
- Constructor menerima 2 parameter
- Saat object dibuat, data langsung terisi
- Tampilkan data user ke console

### 💡 Insight
Constructor = gerbang pertama kehidupan object.  
Kalau salah di sini, chaos lanjutannya.

---

## 3️⃣ Access Modifier & Encapsulation

### 🎯 Tujuan
Data **tidak boleh disentuh sembarangan**.  
Kalau semua bisa akses, itu bukan OOP—itu open war.

### 📌 Ketentuan
Buat class `Account` dengan:
- Attribute:
    - `balance` (double) → **private**
- Method:
    - `deposit(double amount)`
    - `withdraw(double amount)`

### 📜 Aturan
- Tidak boleh withdraw jika saldo kurang
- Saldo tidak boleh negatif

### 💡 Insight
Encapsulation =
> “Lu mau ngubah data? Lewat gue dulu.”

---

## 4️⃣ Getter & Setter

### 🎯 Tujuan
Kontrol data lewat method, bukan lewat emosi.

### 📌 Ketentuan
Buat class `Product` dengan:
- Attribute:
    - `name` (String)
    - `price` (int)
- Semua attribute **private**
- Buat getter & setter
- Setter `price` **tidak boleh < 0**

### 💡 Insight
Setter itu bukan formalitas.  
Dia adalah **satpam data**.

---

## 5️⃣ this Keyword

### 🎯 Tujuan
Membedakan **field milik object** vs **parameter milik method**.  
Kalau bingung, bug senyum tipis.

### 📌 Ketentuan
Buat class `Student` dengan:
- Attribute:
    - `name`
    - `score`
- Constructor menerima parameter dengan **nama yang sama**
- Gunakan keyword `this` dengan benar
- Buat method `printInfo()` untuk menampilkan data

### 💡 Insight
`this` = “yang ini punya object, bukan punya lu.”

---

## 6️⃣ Soal Bonus (Opsional tapi Berbahaya 🔥)

### 🎯 Tujuan
Simulasi **real-case backend**.  
Validasi bukan pajangan.

### 📌 Ketentuan
Buat class `Login` dengan:
- Attribute:
    - `username`
    - `password` → **private**
- Password minimal **8 karakter**
- Validasi dilakukan di **setter**
- Jika password tidak valid → tampilkan pesan error

### 💡 Insight
Security itu bukan fitur tambahan.  
Dia fondasi. Kalau rapuh, runtuh semua.

---

## 🚀 Penutup

Kalau semua soal ini bisa kamu kerjain:
- Kamu **paham OOP**, bukan hafal syntax
- Kamu siap lanjut ke **Inheritance & Polymorphism**
- Kamu nggak bakal bikin class absurd lagi (semoga)

Next level
