package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean isFirstAttack = true;

    public HeavyCavalry() {
        super(150, 20, true);
    }

    @Override
    public int doDamage() {
      if (isFirstAttack) {
          this.isFirstAttack = false;
          return this.getDamage() * 3;
      } else {
          return this.getDamage();
      }
    }



}