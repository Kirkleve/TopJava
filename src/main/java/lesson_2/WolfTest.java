package lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("Кобель");
        wolf.setNickName("Зэвр");
        wolf.setAge((short) 3);
        wolf.setWeight(13.560);
        wolf.setColor("Пепельный");
        System.out.printf("Пол: %s%nКличка: %s%nВозраст: %d%nВес: %.3f%nЦвет: %s%n",
                        wolf.getGender(), wolf.getNickName(), wolf.getAge(),
                        wolf.getWeight(), wolf.getColor());
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
