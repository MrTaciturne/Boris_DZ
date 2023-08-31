package HomeWork5;

import HomeWork5.Heros.Archer;
import HomeWork5.Heros.Mage;
import HomeWork5.Heros.Warrior;

import java.util.Scanner;

public class TrainingGround {

    public static void main(String[] args) {

        String name;

        Scanner in = new Scanner(System.in);

        System.out.print("""
    Добро пожаловать на тренировочное поле!
    Identify yourself, magician: """);



        name = in.nextLine();
        name = name.toUpperCase();
        Mage mage = new Mage(name);
        System.out.println();
        mage.attackEnemy();
        mage.attackEnemy();

        Archer archer = new Archer("Rudolf");
        archer.attackEnemy();
        archer.attackEnemy();
        archer.attackEnemy();
        archer.attackEnemy();
        archer.attackEnemy();
        archer.attackEnemy();

        Warrior warrior = new Warrior("Ronan");
        warrior.attackEnemy();
    }
}
