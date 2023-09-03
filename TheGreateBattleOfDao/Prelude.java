package TheGreateBattleOfDao;

import TheGreateBattleOfDao.Actors.Black.Maneken;
import TheGreateBattleOfDao.Actors.Black.StoneGargoil;
import TheGreateBattleOfDao.Actors.White.Animal;
import TheGreateBattleOfDao.Actors.White.Barbarian;
import TheGreateBattleOfDao.Actors.White.Pathfinder;
import TheGreateBattleOfDao.Weapons.Bow;
import TheGreateBattleOfDao.Weapons.FireSword;
import TheGreateBattleOfDao.Weapons.HolyCross;
import TheGreateBattleOfDao.Weapons.IronSword;

public class Prelude {
    public static void main(String[] args) {


        StoneGargoil gargoil = new StoneGargoil(100);
        Maneken maneken = new Maneken(1000);
        Barbarian barbarian = new Barbarian(new IronSword());
        Barbarian barbarian1 = new Barbarian(new FireSword());
        Barbarian barbarian2 = new Barbarian(new HolyCross());
        Pathfinder pathfinder= new Pathfinder(new Bow());

        System.out.println(barbarian.getPoints());
        System.out.print(barbarian.getPower() + " < Сила; " + barbarian.getWeaponEquipped().getDamageType() + " < Тип урона; " + barbarian.getWeaponEquipped().weaponDamage() + "\n");
        barbarian.barbarianDoubleStrike(gargoil);
        System.out.println(barbarian.getPoints());
        barbarian1.barbarianRage();
        System.out.println(barbarian1.getPoints());
        System.out.print(barbarian1.getPower() + " < Сила; " + barbarian1.getWeaponEquipped().getDamageType() + " < Тип урона; " + barbarian1.getWeaponEquipped().weaponDamage() + "\n");
        barbarian1.barbarianDoubleStrike(gargoil);
        System.out.println(barbarian1.getPoints());

        barbarian.barbarianRage();
        System.out.print(barbarian.getPower() + " < Сила; " + barbarian.getWeaponEquipped().getDamageType() + " < Тип урона; " + barbarian.getWeaponEquipped().weaponDamage() + "\n");
        barbarian.barbarianDoubleStrike(maneken);
        System.out.println();

        barbarian1.barbarianRage();
        System.out.print(barbarian1.getPower() + " < Сила; " + barbarian1.getWeaponEquipped().getDamageType() + " < Тип урона; " + barbarian1.getWeaponEquipped().weaponDamage() + "\n");
        barbarian1.barbarianDoubleStrike(maneken);

        barbarian2.barbarianRage();
        System.out.print(barbarian2.getPower() + " < Сила; " + barbarian2.getWeaponEquipped().getDamageType() + " < Тип урона; " + barbarian2.getWeaponEquipped().weaponDamage() + "\n");
        barbarian2.barbarianDoubleStrike(maneken);

        pathfinder.pathfinderSummon(Animal.CAT, maneken);
        pathfinder.pathfinderSummon(Animal.WOOLF, maneken);
        pathfinder.pathfinderFocus();
        pathfinder.pathfinderSummon(Animal.DOG, maneken);
    }
}
