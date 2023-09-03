package TheGreateBattleOfDao.Actors.White;

import TheGreateBattleOfDao.Actors.Actor;
import TheGreateBattleOfDao.Weapons.Weapon;
import TheGreateBattleOfDao.Weapons.WeaponList;

public class Barbarian extends Hero {


    public Barbarian(Weapon weapon) {
        setHp(50);
        setPoints(3);
        setPower(25);
        setBASE_POWER(25);
        setWeaponEquipped(weapon);
    }

    public void barbarianRage() {
        if (!isPowerActive()) {
            setPoints(getPoints() - 1);
            setPower(getPower() * 2);
            setPowerActive(true);
        } else {
            System.out.println("Нельзя активировать дважды");
        }
    }

    public void barbarianDoubleStrike(Actor target) {
        if (getPoints() > 0) {
            setPoints(getPoints() - 1);
            attack(target);
        } else {
            System.out.println("Недостаточно очков навыков");
        }
    }

}
