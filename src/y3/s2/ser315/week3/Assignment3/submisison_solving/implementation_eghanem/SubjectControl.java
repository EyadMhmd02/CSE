package y3.s2.ser315.week3.implementation_eghanem;

import java.util.LinkedList;

public class SubjectControl {
    public LinkedList<Subject> subjects;

    public SubjectControl() {
        this.subjects = new LinkedList<>();
    }

    public void addSubject(Manager manager, String name) {
        // Check if subject already exists
        for (Subject subject : subjects) {
            if (subject.name.equalsIgnoreCase(name)) {
                return; // Subject already exists
            }
        }

        // Create and add new subject
        Subject newSubject = new Subject(name);
        newSubject.manager = manager;
        subjects.add(newSubject);
        manager.subjects.add(newSubject);
    }

    public void deleteSubject(Manager manager, String name) {
        // Find and remove subject
        for (int i = 0; i < subjects.size(); i++) {
            Subject subject = subjects.get(i);
            if (subject.name.equalsIgnoreCase(name)) {
                subjects.remove(i);
                manager.subjects.remove(subject);
                return;
            }
        }
    }
}