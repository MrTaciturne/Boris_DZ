package HomeWork5.Enemy;

public abstract class Enemy {

    private static int hp;

    public void setHp(int hp) {
        this.hp = hp;
    }


    public static void takeDamage(int damage){
        if (hp <= 0) {
            System.out.println("Corpses cant die");
        } else {
            hp -= damage;
            if (hp <= 0) {
                System.out.println("Enemy was slain");
            }
        }
    }

}
