package TheGreateBattleOfDao.Weapons;

import TheGreateBattleOfDao.Interfaces.Weapons.Cutting;
import TheGreateBattleOfDao.Interfaces.Weapons.DamageType;
import TheGreateBattleOfDao.Interfaces.Weapons.Melee;

public class IronSword extends Weapon implements Cutting, Melee {


    public IronSword() {
        setDamageType(DamageType.CUTTING);
        setPhysicalDamage(5);
        setWeaponList(WeaponList.IRON_SWORD);
    }
}
