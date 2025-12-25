package main.java.com.phase1.OopBasic.Latihan.Soal06;

public class Login {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        if(password.length() < 8) {
            throw new Exception("Password Minimal 8 Karakter");
        }
        this.password = password;
    }

    public static void main(String[] args) throws Exception{
        Login login = new Login();
        login.setPassword("abc");

    }
}
