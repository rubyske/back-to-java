# Java Method

Method = blok kode bernama yang bisa dipanggil berulang kali.

---
## Method Declaration
### Struktur Dasar
```java 
accessModifier returnType methodName(parameter) {
    // body
}
```
### Contoh
```java
public void sayHello() {
    System.out.println("Hello Java");
}
```
Penjelasan : 
1. accessModifier
* **public** → bisa dipanggil dari mana saja
* **private** → cuma bisa dipakai di class itu
* **protected** → satu package / subclass
2. returnType : 
* **void** → tidak mengembalikan nilai
* **int**, **String**, **boolean**, dll → harus **return**
3. methodName
* pakai **camelCase**
* harus kata kerja → **calculateTotal**, **validateUser**
4. parameter
* input data ke method
* boleh kosong, satu, atau banyak

## Parameter & Return Type
### Parameter (Data Masuk)
```java
public void greet(String name) {
    System.out.println("Hello " + name);
}
```
Penjelasan : 
* **String name** -> Parameter
* saat dipanggil : 
```java
greet("Badru");
```
### Return Type (Data Keluar)
```java
public int sum(int a, int b) {
    return a + b;
}
```
* Wajib return sesuai tipe

* Kalau void, tidak boleh return nilai
```java
public void printSum(int a, int b) {
    System.out.println(a + b);
}
```

## Method Overloading
**Overloading** = nama method sama dengan parameter yang berbeda
Beda Bisa : 
* jumlah parameter 
* tipe parameter 
* urutan parameter
```java
public int add(int a, int b) {
    return a + b;
}

public double add(double a, double b) {
    return a + b;
}

public int add(int a, int b, int c) {
    return a + b + c;
}

```
## Recursion
**Recursion = method memanggil dirinya sendiri.**
```java
public int factorial(int n) {
    if (n == 1) {
        return 1; // base case
    }
    return n * factorial(n - 1);
}
```
### Dua Komponen Wajib
1. Base case → kondisi berhenti
2. Recursive call → memanggil diri sendiri

📌 Kapan pakai recursion?
* Tree
* Graph
* DFS
* Backtracking

## Static vs Instance Method
### Instance Method
* Butuh object
* Bisa akses instance variable
```java
class Calculator {
    int base = 10;

    public int add(int x) {
        return base + x;
    }
}
```
Pemanggilan :
```java
Calculator calc = new Calculator();
calc.add(5);
```
### Static Method
* Tidak butuh object
* Milik class
* Tidak bisa akses instance variable langsung
```java
class MathUtil {
    public static int multiply(int a, int b) {
        return a * b;
    }
}
```
Pemanggilan :
```java
MathUtil.multiply(2, 3);
```
📌 Rule of thumb:

* Utility → static
* Behavior object → instance

**Ringkasan Cepat (biar nempel)**

* Method = unit logika
* Parameter = input
* Return = output
* Overloading = fleksibilitas
* Recursion = powerful tapi berbahaya
* Static ≠ Instance (beda alam semesta)
