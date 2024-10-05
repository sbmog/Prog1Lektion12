package opgave02;

public class Monster {
    private int lifePoints;
    private int damagePoints;
    private int chanceOfHit;
    private String description;
    private String attackDescription;

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
            hero.setLifePoints(hero.getLifePoints() - damagePoints);
            if (hero.getLifePoints() <= 0) {
                System.out.println("Slaying " + hero.getName());
            }
        } else {
            System.out.println(" but " + hero.getName() + " defends heroically");
        }
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int setLifePoints(int lifePoints) {
        return this.lifePoints = lifePoints;
    }

    public String getDescription() {
        return description ;

    }
}
