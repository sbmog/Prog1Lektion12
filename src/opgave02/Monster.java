package opgave02;

public class Monster {
    int lifePoints;
    int damagePoints;
    int chanceOfHit;
    String description;
    String attackDescription;
    public Monster(int lifePoints, int damagePoints, int chanceOfHit, String description, String attackDescription) {
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.chanceOfHit = chanceOfHit;
        this.description = description;
        this.attackDescription = attackDescription;
    }
    public void attacks(int roll, Hero hero) {
        System.out.print("the " + description + " " + attackDescription);
        if (roll <= chanceOfHit) {
            System.out.println(" inflicting " + damagePoints + " damage");
            hero.lifePoints -= damagePoints;
            if (hero.lifePoints <= 0) {
                System.out.println("Slaying " + hero.name);
            }
        } else {
            System.out.println(" but " + hero.name + " defends heroically");
        }
    }
}
