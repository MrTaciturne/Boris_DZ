package TheGreateBattleOfDao.Actors.Gray;

import TheGreateBattleOfDao.Weapons.Claw;

public class Dog extends Neutral{

    public Dog(){
        setHp(10);
        setPower(10);
        setWeaponEquipped(new Claw());
    }
}
