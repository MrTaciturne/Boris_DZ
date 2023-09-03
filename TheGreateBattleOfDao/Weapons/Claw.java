package TheGreateBattleOfDao.Weapons;

import TheGreateBattleOfDao.Interfaces.Weapons.Cutting;
import TheGreateBattleOfDao.Interfaces.Weapons.DamageType;

public class Claw extends Weapon implements Cutting {

    public Claw(){
        setDamageType(DamageType.CUTTING);
        setPhysicalDamage(1);
        setWeaponList(WeaponList.CLAW);
    }
}
