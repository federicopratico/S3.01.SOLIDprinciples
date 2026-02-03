package models;

import Interfaces.DamageBehaviour;

public abstract class Character {
    private DamageBehaviour damageBehaviour;

    public Character(DamageBehaviour damageBehaviour) {
        this.damageBehaviour = damageBehaviour;
    }

    public DamageBehaviour getDamageBehaviour() {
        return damageBehaviour;
    }

    public void attack() {
        System.out.println("The character attacks with a weapon.");
    }

    public void takeDamage(int points) {
        damageBehaviour.takeDamage(points);
    }
}
