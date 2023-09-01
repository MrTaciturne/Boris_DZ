package HomeWork5.Heros;

import HomeWork5.Enemy.Enemy;
import java.util.Random;

public abstract class Hero {

    Random rnd = new Random();
    int luck;
    private String name;
    private static int power;

    Hero (String name) {
        this.name = name;
    }

    public static int getPower() {
        return power;
    }
    public static void setPower(int power) {
        Hero.power = power;
    }

    public void attackEnemy() {
        Enemy.takeDamage(power);
        System.out.println();
    }

    public String getName() {
        return name;
    }
}
