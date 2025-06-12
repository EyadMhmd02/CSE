package y3.s2.ser315.week7.attempt.Composite_eghanem;

// FamilyComposite.java (replaces Tree)

import java.util.ArrayList;
import java.util.List;

public class FamilyComposite extends FamilyComponent {
    private List<FamilyComponent> components = new ArrayList<>();

    public FamilyComposite(String name) {
        super(name);
    }

    public void addComponent(FamilyComponent component) {
        components.add(component);
    }

    public void removeComponent(FamilyComponent component) {
        components.remove(component);
    }

    public FamilyComponent getChild(int index) {
        return components.get(index);
    }

    @Override
    public void print() {
        System.out.println(name);

        // Print all children with indentation
        for (FamilyComponent component : components) {
            System.out.print("  ");
            component.print();
        }
    }
}