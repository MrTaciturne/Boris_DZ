package TheGreateBattleOfDao.Actors.Black;

import TheGreateBattleOfDao.Interfaces.Alive.CuttingResistable;
import TheGreateBattleOfDao.Interfaces.Alive.FireResistable;
import TheGreateBattleOfDao.Interfaces.Alive.Resistable;
import TheGreateBattleOfDao.Interfaces.Alive.Resistables;

import java.util.SplittableRandom;

public class StoneGargoil extends Gargoil implements FireResistable, CuttingResistable {


    public StoneGargoil(int hp) {
        super(hp);
        setResist(new String[] {FireResistable.resist.getResistables()});
    }


}
