public class Course {

	private int number;

	private String dept;

	private String description;

	private int credits;

	public Course(String department, int classNumber, int credits, String description, Professor prof) {

	}

	public Course(String department, int classNumber, int credits, String description) {

	}

	public String getName() {
		return null;
	}

	public int getCredits() {
		return 0;
	}

	public boolean addProfessor(Professor prof) {
		return false;
	}

	public Professor getProfessor() {
		return null;
	}

	public boolean enrollStudent(Student student) {
		return false;
	}

	public List<String> getStudentNames() {
		return null;
	}

	public FieldTrip getFieldTrip() {
		return null;
	}

}
