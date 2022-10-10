package lesson_2_3_4.person;

public class Person {
    String gender = "man";
    String name = "Kirill";
    int height = 193;
    double weight = 89;
    short age = 30;

    void run() {
        System.out.println("running");
    }

    String walk() {
        return "goes";
    }

    void swim() {
        System.out.println("swim");
    }

    boolean learnJava() {
        return true;
    }
}
