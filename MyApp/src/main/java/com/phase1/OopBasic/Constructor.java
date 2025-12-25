package main.java.com.phase1.OopBasic;

public class Constructor {
    // Constructor = method spesial buat lahirin object
    String name;

    public Constructor() {;
        System.out.println("ini adalah constructor" );
    }

    // Constructor dengan parameter


    public Constructor(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // untuk memanggil contructor hanya perlu membuat object saja
        Constructor panggilConstructor = new Constructor();
        Constructor panggilConsParamater = new Constructor("Badru");
    }
}
