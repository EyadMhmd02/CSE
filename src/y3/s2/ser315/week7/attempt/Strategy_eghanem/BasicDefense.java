package y3.s2.ser315.week7.attempt.Strategy_eghanem;

// BasicDefense.java
public class BasicDefense implements DefenseStrategy {
    @Override
    public int defend(int damage, int resilience) {
        int damageTaken = damage - resilience;
        return damageTaken < 0 ? 0 : damageTaken;
    }
}
