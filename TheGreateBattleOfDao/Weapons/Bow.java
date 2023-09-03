package TheGreateBattleOfDao.Weapons;

import TheGreateBattleOfDao.Interfaces.Weapons.Cutting;
import TheGreateBattleOfDao.Interfaces.Weapons.DamageType;
import TheGreateBattleOfDao.Interfaces.Weapons.Distance;

public class Bow extends Weapon implements Cutting, Distance {

    public Bow (){
        setDamageType(DamageType.CUTTING);
        setPhysicalDamage(3);
        setWeaponList(WeaponList.BOW);
    }
}
