package TheGreateBattleOfDao.Actors.White;

import TheGreateBattleOfDao.Actors.Actor;
import TheGreateBattleOfDao.Actors.Gray.Cat;
import TheGreateBattleOfDao.Actors.Gray.Dog;
import TheGreateBattleOfDao.Actors.Gray.Woolf;
import TheGreateBattleOfDao.Weapons.Weapon;

public class Pathfinder extends Hero {

    public Pathfinder(Weapon weapon) {
        setHp(40);
        setPoints(3);
        setBASE_POWER(15);
        setPower(15);
        setWeaponEquipped(weapon);
    }

    public void pathfinderSummon(Animal animal, Actor target) {
        if (getPoints() > 0) {
            setPoints(getPoints() - 1);
            if (isPowerActive()) {
                switch (animal) {
                    case CAT -> {
                        new Cat().attack(target);
                        new Cat().attack(target);
                    }
                    case DOG -> {
                        new Dog().attack(target);
                        new Dog().attack(target);
                    }
                    case WOOLF -> {
                        new Woolf().attack(target);
                        new Woolf().attack(target);
                    }
                }
            } else {
                switch (animal) {
                    case CAT -> new Cat().attack(target);
                    case DOG -> new Dog().attack(target);
                    case WOOLF -> new Woolf().attack(target);
                }
            }
        } else {
            System.out.println("Недостаточно очков навыков");
        }
    }



    public void pathfinderFocus() {
        if (isPowerActive()) {
            System.out.println("Усиление уже активно");
        } else {
            setPowerActive(true);
            setPower(getBASE_POWER() * 2);
        }
    }
}
