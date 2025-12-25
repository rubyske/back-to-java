package main.java.com.phase1.OopBasic;

public class Encapsulation {
    // Encapsulation = menyembunyikan data + mengontrol akses
    // yaitu dengan menggunakan getter(mengambil data) dan setter (mengontrol data)
    private String userName;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName == null || userName.isEmpty()){
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
