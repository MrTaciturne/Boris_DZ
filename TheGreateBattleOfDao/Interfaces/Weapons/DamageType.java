package TheGreateBattleOfDao.Interfaces.Weapons;

import TheGreateBattleOfDao.Interfaces.Weapons.Crushing;

public enum DamageType {
    CUTTING("cutting"),
    CRUSHING("crushing"),
    FIRE_DAMAGE("fire"),
    HOLY_DAMAGE("holy");

    String type;

    DamageType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
