package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean hasShield = true;

    public Swordsman(boolean hasArmor) {
        super(100, 10, hasArmor);
    }

    @Override
    public void sufferDamage(int damage) {
        if (hasShield) {
            hasShield = false;
        } else if (super.getHasArmor()) {
            this.setHitPoints(getHitPoints() - damage / 2);
        } else {
            super.setHitPoints(this.getHitPoints() - damage);
        }
    }

}