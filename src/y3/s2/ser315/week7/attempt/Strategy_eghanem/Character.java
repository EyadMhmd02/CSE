package y3.s2.ser315.week7.attempt.Strategy_eghanem;

// Character.java
public abstract class Character {
    protected String name;
    protected int strength;
    protected int resilience;
    protected AttackStrategy attackStrategy;
    protected DefenseStrategy defenseStrategy;

    public int attackEnemy() {
        return attackStrategy.attack(strength);
    }

    public int takeHit() {
        java.util.Random random = new java.util.Random();
        int incomingDamage = random.nextInt(15);
        return defenseStrategy.defend(incomingDamage, resilience);
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }
}
