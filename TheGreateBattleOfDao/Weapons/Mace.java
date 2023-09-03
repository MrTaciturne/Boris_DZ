package TheGreateBattleOfDao.Weapons;

import TheGreateBattleOfDao.Interfaces.Weapons.Crushing;
import TheGreateBattleOfDao.Interfaces.Weapons.Melee;

public class Mace extends Weapon implements Crushing, Melee {

    public Mace() {
        setDamageType(damageType);
        setPhysicalDamage(6);
        setWeaponList(WeaponList.MACE);
    }
}
