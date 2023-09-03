package TheGreateBattleOfDao.Actors;


import TheGreateBattleOfDao.Interfaces.Alive.Resistable;
import TheGreateBattleOfDao.Interfaces.Alive.Weaknessed;
import TheGreateBattleOfDao.Weapons.Weapon;

import java.lang.reflect.Array;


public abstract class Actor {

    private int BASE_POWER;
    private int hp;
    private int power;
    private int points;
    private boolean powerActive;
    private boolean alive = true;
    private Weapon weaponEquipped;
    private String[] resist = new String[10];
    private String[] weakness = new String[10];


    public int getBASE_POWER() {
        return BASE_POWER;
    }

    public void setBASE_POWER(int BASE_POWER) {
        this.BASE_POWER = BASE_POWER;
    }

    public String getWeakness(int i) {
        return weakness[i];
    }

    public void setWeakness(String[] weaknessTypes) {
        System.arraycopy(weaknessTypes, 0, weakness, 0, weaknessTypes.length);
    }

    public String getResist(int i) {
        return resist[i];
    }

    public void setResist(String[] resistTypes) {
        System.arraycopy(resistTypes, 0, resist, 0, resistTypes.length);
    }

    public Weapon getWeaponEquipped() {
        return weaponEquipped;
    }

    public void setWeaponEquipped(Weapon weaponEquipped) {
        this.weaponEquipped = weaponEquipped;
    }

    public boolean isPowerActive() {
        return powerActive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setPowerActive(boolean powerActive) {
        this.powerActive = powerActive;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void attack(Actor target) {
        target.takeStrike(weaponEquipped.getDamageType(), (weaponEquipped.weaponDamage() + getPower()), target);
    }

    public void newTurn() {
        setPowerActive(false);
        setPoints(getPoints() + 1);
        setPower(getBASE_POWER());
    }



    public void takeStrike(String damageType, int damage, Actor target) {

        if (isAlive()) {
            target.setHp((int) (target.getHp() - damageByResist(damageType, damage, target)));
            System.out.println(target.getClass().getSimpleName() + " получает " + damageByResist(damageType, damage, target) + " " + damageType + " урона");
            System.out.println(target.getClass().getSimpleName() + " имеет " + target.getHp() + " единиц здоровья");
        } else {
            System.out.println("Трупы не ощущают боли");
        }
    }



    private float damageByResist(String damageType, int damage, Actor target) {
        float outDamage = damage;
        if (target instanceof Resistable || target instanceof Weaknessed) {
            for(int i = 0; i < resist.length; i++) {

                if (target.getResist(i) == damageType) {
                    outDamage /= 2;
                }
            }
            for(int i = 0; i < weakness.length; i++) {
                if (target.getWeakness(i) == damageType) {
                    outDamage *= 2;
                }
            }
            return outDamage;
        } else {
            return outDamage;
        }
    }
}

