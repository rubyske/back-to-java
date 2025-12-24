# Java Program Structure & Package

## Pendahuluan

Java adalah bahasa pemrograman berorientasi objek (OOP) yang mengharuskan kita untuk mengorganisir kode dengan rapi dan terstruktur. Sebelum mulai coding, penting untuk memahami struktur program, organisasi program, dan penggunaan package agar kode lebih mudah dipelihara dan scalable.

---

## Struktur Program Java

Struktur project Java biasanya seperti berikut:

```
ProjectRoot/
 ├─ src/                  # Folder utama untuk source code
 │   └─ main/
 │       └─ java/
 │           └─ com/
 │               └─ example/
 │                   └─ myapp/
 │                       ├─ Main.java
 │                       └─ utils/
 │                           └─ Helper.java
 ├─ lib/                  # Library tambahan (opsional)
 ├─ build/                # Output compile (.class atau .jar)
 └─ README.md
```

**Penjelasan:**

* **ProjectRoot**: folder utama project.
* **src/main/java**: tempat semua file `.java`.
* **com.example.myapp**: package untuk mengorganisir class.
* **utils**: sub-package untuk helper class.
* **Main.java**: file entry point, biasanya berisi `public static void main(String[] args)`.
* **lib/**: optional, untuk library tambahan (.jar).
* **build/**: output compile.

---

## Organisasi Program Java

Program Java diorganisir menjadi beberapa level:

### Class

Unit terkecil yang berisi atribut (variable) dan method (function).

```java
public class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
```

### Package

Folder logis untuk mengelompokkan class sesuai fungsinya.

Contoh struktur package:

* `com.example.myapp.models` → semua entity/model
* `com.example.myapp.services` → logic/business
* `com.example.myapp.controllers` → API/input-output

### Module (opsional)

Level lebih tinggi dari package, bisa menggabungkan beberapa package (Java 9+).

### Project

Semua class, package, dan resource digabung menjadi satu project.

---

## Package di Java

Package berguna untuk:

* Mengelompokkan class
* Menghindari konflik nama class
* Mempermudah maintainability kode

**Membuat package:**

```java
package com.example.myapp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

**Menggunakan class dari package lain:**

```java
import com.example.myapp.utils.Helper;

public class Main {
    public static void main(String[] args) {
        Helper.printMessage();
    }
}
```

---

## Aturan Penamaan & Struktur Package

* **Lowercase** untuk package: `com.example.myapp`
* **PascalCase** untuk class: `Person`, `EmployeeService`
* **camelCase** untuk method/variable: `sayHello()`, `userName`
* **Folder harus sesuai package**

    * Contoh: `package com.example.myapp.utils;` → folder path: `src/com/example/myapp/utils/`

---

## Kesimpulan

Memahami struktur program, organisasi kode, dan package adalah fondasi utama sebelum masuk ke materi Java lainnya. Dengan struktur yang rapi, project akan lebih mudah dipelihara, scalable, dan meminimalisir konflik nama class.
;;