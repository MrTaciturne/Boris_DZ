package HomeWork5.Heros;

public class Mage extends Hero {

    boolean dead;
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        if (dead == false){
            System.out.println("Mage ready for attack\n");
        System.out.println(getName() + ": Fireball!!!");
        dead = true;
            System.out.println(getName() + " burned himself to the ground. |RIP|");
        } else {
            System.out.println("The magician spends his turn on resurrecting himself\n");
            dead = false;
        }
    }
}
