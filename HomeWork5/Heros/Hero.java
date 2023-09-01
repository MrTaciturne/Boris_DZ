package HomeWork5.Heros;

import java.util.Random;

public abstract class Hero {

    Random rnd = new Random();
    int luck;
    private String name;
    private int power;

    Hero (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void attackEnemy (){
        System.out.println(getName() + ": Take it, you beast!");
    }
}
