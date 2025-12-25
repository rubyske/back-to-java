package main.java.com.phase1.OopBasic.Latihan.Soal02;

public class User {
    private String userName;
    private String email;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;

        System.out.println(this.userName);
        System.out.println(this.email);
    }

    public static void main(String[] args) {
        User objUser = new User("BadruKamal", "badrukamal327@gmail.com");
    }
}
