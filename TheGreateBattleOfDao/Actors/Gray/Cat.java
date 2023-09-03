package TheGreateBattleOfDao.Actors.Gray;

import TheGreateBattleOfDao.Weapons.Claw;

public class Cat extends Neutral {

    public Cat(){
        setHp(5);
        setPower(5);
        setWeaponEquipped(new Claw());
    }
}
