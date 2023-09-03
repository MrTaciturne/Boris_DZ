package TheGreateBattleOfDao.Actors.White;

import TheGreateBattleOfDao.Actors.Actor;
import TheGreateBattleOfDao.Weapons.WeaponList;

public abstract class Hero extends Actor {

private WeaponList weaponList;

    public WeaponList getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(WeaponList weaponList) {
        this.weaponList = weaponList;
    }
}
