package y3.s2.ser315.week7.attempt.Strategy_eghanem;

// Main.java
public class Main {
    public static void main(String[] args) {
        Character orc = new Orc("Grumlin");
        Character elf = new Elf("Therae");

        System.out.println("Using basic strategies:");
        int damageDealt = orc.attackEnemy();
        System.out.println(orc.name + " has attacked an enemy and dealt " + damageDealt + " damage");

        int damageTaken = elf.takeHit();
        System.out.println(elf.name + " has taken a hit and been dealt " + damageTaken + " damage");

        System.out.println("\nChanging to advanced strategies:");
        orc.setAttackStrategy(new SpellAttack());
        elf.setDefenseStrategy(new DodgeDefense());

        damageDealt = orc.attackEnemy();
        System.out.println(orc.name + " has attacked with a spell and dealt " + damageDealt + " damage");

        damageTaken = elf.takeHit();
        System.out.println(elf.name + " has attempted to dodge and taken " + damageTaken + " damage");

        // Testing different combinations
        System.out.println("\nTesting different strategy combinations:");

        // Create a mage character (elf with spell attack)
        Character mage = new Elf("Gandalf");
        mage.setAttackStrategy(new SpellAttack());

        // Create a tank character (orc with dodge defense)
        Character tank = new Orc("Brutus");
        tank.setDefenseStrategy(new DodgeDefense());

        damageDealt = mage.attackEnemy();
        System.out.println(mage.name + " has cast a spell for " + damageDealt + " damage");

        damageTaken = tank.takeHit();
        System.out.println(tank.name + " has attempted to dodge and taken " + damageTaken + " damage");
    }
}