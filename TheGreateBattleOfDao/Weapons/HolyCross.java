package TheGreateBattleOfDao.Weapons;

import TheGreateBattleOfDao.Interfaces.Weapons.Crushing;
import TheGreateBattleOfDao.Interfaces.Weapons.DamageType;
import TheGreateBattleOfDao.Interfaces.Weapons.Holy;

public class HolyCross extends Weapon implements Crushing, Holy {

    public HolyCross (){
        setDamageType(DamageType.HOLY_DAMAGE);
        setPhysicalDamage(5);
        setWeaponList(WeaponList.HOLY_CROSS);
    }
}
