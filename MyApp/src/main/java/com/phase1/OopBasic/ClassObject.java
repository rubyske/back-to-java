package main.java.com.phase1.OopBasic;

public class ClassObject {
    // class adalah blueprint, object adalah makhluk hidupnya.
    // ClassObject ->  class

    //membuat method
    public void nama(String nama){
        System.out.println(nama);
    }
    public static void main(String[] args) {
        ClassObject panggilNama = new ClassObject(); // panggilNama -> object untuk memanggil method yang ada dalam class
        panggilNama.nama("Badru");
    }
}
