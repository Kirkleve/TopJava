package lesson_2;

public class Wolf {
    private String gender;
    private String nickName;
    private double weight;
    private short age;
    private String color;

    public String getGender() {
        return gender;
    }

    public String getNickName() {
        return nickName;
    }

    public double getWeight() {
        return weight;
    }

    public short getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(short age) {
        short maxAge = 8;
        if (age >= maxAge) {
            System.out.println("Некорректный возраст");
        } else this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Идёт");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}
