package lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "Кобель";
        wolf.nickName = "Зэвр";
        wolf.age = 3;
        wolf.weight = 13.560;
        wolf.color = "Пепельный";
        System.out.printf("Пол: %s%nКличка: %s%nВозраст: %d%nВес: %.3f%nЦвет: %s%n",
                        wolf.gender, wolf.nickName, wolf.age, wolf.weight, wolf.color);
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
