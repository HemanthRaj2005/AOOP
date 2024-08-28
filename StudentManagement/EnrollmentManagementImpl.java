public class EnrollmentManagementImpl implements EnrollmentManagement {
    private StudentManagement studentManagement;
    private CourseManagement courseManagement;

    public EnrollmentManagementImpl(StudentManagement studentManagement, CourseManagement courseManagement) {
        this.studentManagement = studentManagement;
        this.courseManagement = courseManagement;
    }

    @Override
    public void enrollStudent(String studentId, String courseId) {
        Student student = studentManagement.getStudent(studentId);
        Course course = courseManagement.getCourse(courseId);
        if (student != null && course != null) {
            student.enrollCourse(courseId);
            course.enrollStudent(studentId);
        }
    }

    @Override
    public void unenrollStudent(String studentId, String courseId) {
        Student student = studentManagement.getStudent(studentId);
        Course course = courseManagement.getCourse(courseId);
        if (student != null && course != null) {
            student.unenrollCourse(courseId);
            course.unenrollStudent(studentId);
        }
    }
}
