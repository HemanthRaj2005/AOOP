package week6inlab;

public class Main {
    public static void main(String[] args) {
    
        IStudent student1 = new Student("S001", "Alice");
        IStudent student2 = new Student("S002", "Bob");

        ICourse course1 = new Course("C001", "Mathematics");
        ICourse course2 = new Course("C002", "Science");

        IEnrollmentManager enrollmentManager = new EnrollmentManager();

        enrollmentManager.enrollStudentInCourse(student1, course1);
        enrollmentManager.enrollStudentInCourse(student2, course2);
        enrollmentManager.enrollStudentInCourse(student1, course2);

        System.out.println(student1.getName() + " is enrolled in: ");
        student1.getCourses().forEach(course -> System.out.println(course.getCourses()));

        System.out.println(course1.getCourseName() + " has enrolled students: ");
        course1.getEnrolledStudents().forEach(student -> System.out.println(student.getName()));
    }
}

