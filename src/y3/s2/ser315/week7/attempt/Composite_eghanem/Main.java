package y3.s2.ser315.week7.attempt.Composite_eghanem;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create individual family members (leaves)
        FamilyLeaf john = new FamilyLeaf("John", "Born 1980");
        FamilyLeaf mary = new FamilyLeaf("Mary", "Born 1982");
        FamilyLeaf peter = new FamilyLeaf("Peter", "Born 2005");
        FamilyLeaf susan = new FamilyLeaf("Susan", "Born 2007");

        // Create family units (composites)
        FamilyComposite johnAndMary = new FamilyComposite("John and Mary's Family");
        johnAndMary.addComponent(john);
        johnAndMary.addComponent(mary);
        johnAndMary.addComponent(peter);
        johnAndMary.addComponent(susan);

        FamilyComposite grandparents = new FamilyComposite("Grandparents");
        FamilyLeaf grandfather = new FamilyLeaf("Grandfather", "Born 1950");
        FamilyLeaf grandmother = new FamilyLeaf("Grandmother", "Born 1952");

        grandparents.addComponent(grandfather);
        grandparents.addComponent(grandmother);

        // Create the overall family tree
        FamilyComposite familyTree = new FamilyComposite("Complete Family Tree");
        familyTree.addComponent(grandparents);
        familyTree.addComponent(johnAndMary);

        // Print the entire tree
        familyTree.print();
    }
}
