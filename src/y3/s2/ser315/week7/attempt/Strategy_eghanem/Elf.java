package y3.s2.ser315.week7.attempt.Strategy_eghanem;

// Elf.java
public class Elf extends Character {
    public Elf(String name) {
        this.name = name;
        this.strength = 4;
        this.resilience = 2;
        this.attackStrategy = new BasicAttack();
        this.defenseStrategy = new BasicDefense();
    }
}