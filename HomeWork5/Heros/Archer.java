package HomeWork5.Heros;

import java.util.Random;

public class Archer extends Hero {


    public Archer(String name) {
        super(name);
        setPower(15);
    }

    @Override
    public void attackEnemy() {
        System.out.println("The archer releases an arrow");
        luck = rnd.nextInt(20) + 1;
        if (luck >= 10) {
            super.attackEnemy();
            System.out.println("Bull's-eye!\n");
        } else {
            System.out.println("Damn, I missed..\n");
        }
    }
}
