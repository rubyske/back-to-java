package main.java.com.phase1.OopBasic.Latihan.Soal04;

public class Product {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            System.out.println("price tidak boleh kurang dari 0");
        }
        this.price = price;
    }
}
