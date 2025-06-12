package y3.s2.ser315.week7.attempt.Strategy_eghanem;

// SpellAttack.java

import java.util.Random;

public class SpellAttack implements AttackStrategy {
    @Override
    public int attack(int strength) {
        Random random = new Random();
        int spellDamage = random.nextInt(5);
        return strength + spellDamage;
    }
}
