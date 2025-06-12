package y3.s2.ser315.week7.attempt.Strategy_eghanem;

// Orc.java
public class Orc extends Character {
    public Orc(String name) {
        this.name = name;
        this.strength = 10;
        this.resilience = 9;
        this.attackStrategy = new BasicAttack();
        this.defenseStrategy = new BasicDefense();
    }
}
