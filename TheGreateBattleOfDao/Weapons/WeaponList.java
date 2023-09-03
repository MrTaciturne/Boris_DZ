package TheGreateBattleOfDao.Weapons;

public enum WeaponList {

    IRON_SWORD ("iron sword"),
    FIRE_SWORD ("fire sword"),
    BOW ("bow"),
    HOLY_CROSS ("holy cross"),
    CLAW ("claw"),
    MACE ("mace");

    private String weaponList;

    WeaponList(String weaponList){
        this.weaponList = weaponList;
    }

    public String getWeaponList() {
        return weaponList;
    }
}
