package HomeWork5.Heros;

import HomeWork5.Enemy.Enemy;

public class Mage extends Hero {

    boolean dead;
    public Mage(String name) {
        super(name);
        setPower(50);
    }


    @Override
    public void attackEnemy() {
        if (dead == false){
            System.out.println("Mage ready for attack\n");
        System.out.println(getName() + ": Fireball!!!");
        super.attackEnemy();
        dead = true;
            System.out.println(getName() + " burned himself to the ground. |RIP|");
        } else {
            System.out.println("The magician spends his turn on resurrecting himself\n");
            dead = false;
        }
    }
}
