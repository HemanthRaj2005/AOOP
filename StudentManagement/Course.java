import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String name;
    private List<String> enrolledStudents;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(String studentId) {
        enrolledStudents.add(studentId);
    }

    public void unenrollStudent(String studentId) {
        enrolledStudents.remove(studentId);
    }
}
