import java.util.HashMap;
import java.util.Map;

public class StudentManagementImpl implements StudentManagement {
    private Map<String, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public void removeStudent(String studentId) {
        students.remove(studentId);
    }

    @Override
    public Student getStudent(String studentId) {
        return students.get(studentId);
    }
}
