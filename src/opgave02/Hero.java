package opgave02;

public class Hero {
    int lifePoints;
    int damagePoints;
    int chanceOfHit;
    String name;
    String pronoun;
    String weapon;

    public Hero(int lifePoints, int damagePoints, int chanceOfHit, String name, String pronoun, String weapon) {
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.chanceOfHit = chanceOfHit;
        this.name = name;
        this.pronoun = pronoun;
        this.weapon = weapon;
    }

    public void attacks(int roll, Monster monster) {
        System.out.print(name + " attacks with " + pronoun + " " + weapon);
        if (roll <= chanceOfHit) {
            System.out.println(" and hits the " + monster.description + " inflicting " + damagePoints);
            monster.lifePoints -= damagePoints;
            if (monster.lifePoints <= 0) {
                System.out.println("killing the " + monster.description);
            }
        } else {
            System.out.println(" but misses the target.");
        }
    }
}
