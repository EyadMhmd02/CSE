package y3.s2.ser315.week7.attempt.Composite_eghanem;

// FamilyLeaf.java (replaces Person)
public class FamilyLeaf extends FamilyComponent {
    private String details;

    public FamilyLeaf(String name, String details) {
        super(name);
        this.details = details;
    }

    public FamilyLeaf(String name) {
        super(name);
        this.details = "";
    }

    @Override
    public void print() {
        System.out.println(name + (details.isEmpty() ? "" : " - " + details));
    }
}
