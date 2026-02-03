package models;

import Interfaces.DamageBehaviour;

public class WarriorDamage implements DamageBehaviour {
    @Override
    public void takeDamage(int points) {
        System.out.println("The warrior resists and only takes " + (points / 2) + " points of damage.");
    }
}
