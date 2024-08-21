package week6inlab;

import java.util.List;

public interface ICourse {
    String getCourseId();
    String getCourseName();
    List<IStudent> getEnrolledStudents();
    void enrollStudent(IStudent student);
}
