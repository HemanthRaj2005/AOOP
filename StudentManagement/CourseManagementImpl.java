import java.util.HashMap;
import java.util.Map;

public class CourseManagementImpl implements CourseManagement {
    private Map<String, Course> courses = new HashMap<>();

    @Override
    public void addCourse(Course course) {
        courses.put(course.getId(), course);
    }

    @Override
    public void removeCourse(String courseId) {
        courses.remove(courseId);
    }

    @Override
    public Course getCourse(String courseId) {
        return courses.get(courseId);
    }
}
