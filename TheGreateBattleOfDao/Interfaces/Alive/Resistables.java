package TheGreateBattleOfDao.Interfaces.Alive;

public enum Resistables {
    FIRE_RESIST("fire"),
    CUTTING_RESIST("cutting"),
    CRUSHING_RESIST("crushing");

    private String resistables;

    Resistables(String resistables){
        this.resistables = resistables;
    }

    public String getResistables() {
        return resistables;
    }
}
