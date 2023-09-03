package TheGreateBattleOfDao.Weapons;


import TheGreateBattleOfDao.Interfaces.Weapons.DamageType;

public abstract class Weapon {

    private int physicalDamage;
    private int fireDamage;
    private int lightingDamage;
    private DamageType damageType;
    private WeaponList weaponList;


    public int getFireDamage() {
        return fireDamage;
    }

    public void setFireDamage(int fireDamage) {
        this.fireDamage = fireDamage;
    }

    public int getLightingDamage() {
        return lightingDamage;
    }

    public void setLightingDamage(int lightingDamage) {
        this.lightingDamage = lightingDamage;
    }

    public WeaponList getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(WeaponList weaponList) {
        this.weaponList = weaponList;
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public String getDamageType() {
        return damageType.getType();
    }

    public int weaponDamage(){
        return (getPhysicalDamage() + getFireDamage() + getLightingDamage());
    }
    public void getSpecifications() {
        System.out.println(getWeaponList() + " " + getDamageType() + " damage = " + weaponDamage());
    }

    public void setPhysicalDamage(int physicalDamage) {
        this.physicalDamage = physicalDamage;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

}
