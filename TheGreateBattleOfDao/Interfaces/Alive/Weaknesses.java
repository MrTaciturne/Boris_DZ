package TheGreateBattleOfDao.Interfaces.Alive;

public enum Weaknesses {

    FIRE_WEAKNESSES("fire"),
    CUTTING_WEAKNESSES("cutting"),
    HOLY_WEAKNESSES("holy"),
    CRUSHING_WEAKNESSES("crushing");


    private String weaknesses;

    Weaknesses(String weaknesses){
        this.weaknesses = weaknesses;
    }

    public String getWeaknesses() {
        return weaknesses;
    }
}
