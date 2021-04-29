package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean hasShield = true;

    public Swordsman(boolean hasShield) {
        super(100, 10, hasShield);
    }

    @Override
    public void sufferDamage(int damage) {
        if (hasShield) {
            hasShield = false;
        } else {
            super.setHitPoints(this.getHitPoints() - damage);
        }
    }

}