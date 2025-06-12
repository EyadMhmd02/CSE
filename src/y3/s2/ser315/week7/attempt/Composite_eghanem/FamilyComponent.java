package y3.s2.ser315.week7.attempt.Composite_eghanem;

// FamilyComponent.java
public abstract class FamilyComponent {
    protected String name;

    public FamilyComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}