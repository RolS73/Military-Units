package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damage;
    private boolean hasArmor;

    public MilitaryUnit(int health, int damage, boolean hasArmor) {
        this.hitPoints = health;
        this.damage = damage;
        this.hasArmor = hasArmor;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isHasArmor() {
        return hasArmor;
    }

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        this.hitPoints = hitPoints - damage;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHasArmor(boolean hasArmor) {
        this.hasArmor = hasArmor;
    }
}
