package main.java.com.phase1.OopBasic;

public class AccessModifier {
    /*
        | Modifier    | Akses                   |
        | ----------- | ----------------------- |
        | `public`    | Dari mana saja          |
        | `protected` | Satu package / subclass |
        | (default)   | Satu package            |
        | `private`   | Hanya di class itu      |
    * */
    public String userName ;  // -> bisa di akses bebas
    private int umur; // -> tidak bisa diakses dari luar class
}
