package HomeWork5.Heros;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Warrior " + getName() + " ready to attack!");
        System.out.println(getName() + ": I'll rip out your spleen and feed it to your mother!!! \n");
        System.out.println(getName() + " commits an act of violence. Please remove the children from the screen!");
    }
}
