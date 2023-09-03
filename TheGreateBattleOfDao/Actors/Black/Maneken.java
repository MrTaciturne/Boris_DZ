package TheGreateBattleOfDao.Actors.Black;

import TheGreateBattleOfDao.Interfaces.Alive.CuttingResistable;
import TheGreateBattleOfDao.Interfaces.Alive.FireResistable;
import TheGreateBattleOfDao.Interfaces.Alive.FireWeakness;
import TheGreateBattleOfDao.Interfaces.Alive.HolyWeakness;

import java.lang.reflect.Array;

public class Maneken extends Enemy implements CuttingResistable, HolyWeakness, FireWeakness {

public Maneken(int hp){
    super(hp);
    setWeakness(new String[]{HolyWeakness.weakness.getWeaknesses(), FireWeakness.weakness.getWeaknesses()});
    setResist(new String[]{CuttingResistable.resist.getResistables()});
}

public Maneken(){
    super(10);


}
}
