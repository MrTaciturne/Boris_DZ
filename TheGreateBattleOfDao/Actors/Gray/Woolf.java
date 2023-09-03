package TheGreateBattleOfDao.Actors.Gray;

import TheGreateBattleOfDao.Weapons.Claw;

public class Woolf extends Neutral{

    public Woolf(){
        setHp(15);
        setPower(15);
        setWeaponEquipped(new Claw());
    }
}
