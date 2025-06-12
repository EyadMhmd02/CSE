package y3.s2.ser315.week7.attempt.Strategy_eghanem;

// DodgeDefense.java

import java.util.Random;

public class DodgeDefense implements DefenseStrategy {
    @Override
    public int defend(int damage, int resilience) {
        Random random = new Random();
        double chanceToDodge = random.nextDouble();

        if (chanceToDodge > 0.50) {
            return 0;  // Successfully dodged
        } else {
            int damageTaken = damage - resilience;
            return damageTaken < 0 ? 0 : damageTaken;
        }
    }
}
