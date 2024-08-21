package week6inlab;

public interface IStudent {
    String getId();
    String getName();
    void enrollInCourse(ICourse course);
    Iterable<IStudent> getCourses();
}
