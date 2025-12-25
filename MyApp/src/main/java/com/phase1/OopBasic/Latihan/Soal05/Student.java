package main.java.com.phase1.OopBasic.Latihan.Soal05;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void printInfo(){
        System.out.println("My Name : " + name);
        System.out.println("My Score : " + score);
    }

    public static void main(String[] args) {
        Student student =  new Student("Badru", 90);
        student.printInfo();
    }
}
