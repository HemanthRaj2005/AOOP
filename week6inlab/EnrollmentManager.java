package week6inlab;

public class EnrollmentManager implements IEnrollmentManager {
    @Override
    public void enrollStudentInCourse(IStudent student, ICourse course) {
        course.enrollStudent(student);
        student.enrollInCourse(course);
    }
}

