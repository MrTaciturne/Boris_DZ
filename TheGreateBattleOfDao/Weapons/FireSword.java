package TheGreateBattleOfDao.Weapons;

import TheGreateBattleOfDao.Interfaces.Weapons.Cutting;
import TheGreateBattleOfDao.Interfaces.Weapons.DamageType;
import TheGreateBattleOfDao.Interfaces.Weapons.Fiery;
import TheGreateBattleOfDao.Interfaces.Weapons.Melee;

public class FireSword extends Weapon implements Fiery, Melee {


    public FireSword() {
        setFireDamage(10);
        setDamageType(DamageType.FIRE_DAMAGE);
        setWeaponList(WeaponList.FIRE_SWORD);
    }

}
