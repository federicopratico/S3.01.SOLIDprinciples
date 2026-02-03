package models;

import Interfaces.DamageBehaviour;

public class GhostDamage implements DamageBehaviour {
    @Override
    public void takeDamage(int points) {
        System.out.println("A ghost cannot take physical damage!");
    }
}
