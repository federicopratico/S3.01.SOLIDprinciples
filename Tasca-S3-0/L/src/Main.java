import models.Character;
import models.Ghost;
import models.Warrior;

public class Main {
    public static void main(String[] args) {
        Character[] characters = {new Warrior(), new Warrior(), new Ghost(), new Ghost()};
        int points = 10;
        for(models.Character character : characters) {
            character.attack();
            character.takeDamage(points);
            System.out.println();
            points += 10;

        }
    }
}
