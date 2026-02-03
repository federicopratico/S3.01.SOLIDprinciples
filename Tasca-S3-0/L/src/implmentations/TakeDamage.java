package implmentations;

import interfaces.DamageBehaviour;

public class TakeDamage implements DamageBehaviour {
    @Override
    public void takeDamage(int points) {
        System.out.println("The character takes " + points + " points of damage.");
    }
}
