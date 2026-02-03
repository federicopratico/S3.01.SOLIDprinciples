package models;

public class Ghost extends Character {

    public Ghost() {
        super(new GhostDamage());
    }
    @Override
    public void attack() {
        System.out.println("The ghost casts a spooky spell.");
    }

    @Override
    public void takeDamage(int points) {
        getDamageBehaviour().takeDamage(points);
//        throw new UnsupportedOperationException("A ghost cannot take physical damage!");
    }
}
