package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit unit : army) {
            unit.sufferDamage(damage);
        }
        cleanUpFallenUnits();
    }

    private void cleanUpFallenUnits() {
        army.removeIf(unit -> unit.getHitPoints() < 25);
    }

    public int getArmyDamage() {
        int totalArmyDamage = 0;

        for (MilitaryUnit unit : army) {
            totalArmyDamage += unit.doDamage();
        }

        return totalArmyDamage;
    }

    public int getArmySize() {
        return army.size();
    }

}