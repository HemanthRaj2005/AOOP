package week6inlab;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
    private String courseId;
    private String courseName;
    private List<IStudent> enrolledStudents = new ArrayList<>();

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    @Override
    public String getCourseId() {
        return courseId;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public List<IStudent> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public void enrollStudent(IStudent student) {
        enrolledStudents.add(student);
    }
}

