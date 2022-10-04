package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger();
        crimsonTyphoon.setModelName("Crimson Typhoon");
        crimsonTyphoon.setMark("Mark-4");
        crimsonTyphoon.setOrigin("China");
        crimsonTyphoon.setHeight(76.2);
        crimsonTyphoon.setWeight(1.722);
        crimsonTyphoon.setSpeed(9);
        crimsonTyphoon.setStrength(8);
        crimsonTyphoon.setArmor(6);

        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia",
                76.2, 1.850, 10, 10, 9);
        System.out.println(crimsonTyphoon);
        System.out.println(strikerEureka);

    }
}
