package week6inlab;

import java.util.HashSet;
import java.util.Set;

public class Student implements IStudent {
    private String id;
    private String name;
    private Set<ICourse> courses = new HashSet<>();

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void enrollInCourse(ICourse course) {
        courses.add(course);
    }

    @Override
    public Iterable<IStudent> getCourses() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCourses'");
    }
}

