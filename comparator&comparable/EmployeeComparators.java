import java.util.Comparator;

public class EmployeeComparators {
    public static Comparator<Employee> byName() {
        return Comparator.comparing(Employee::getName);
    }

    public static Comparator<Employee> bySalary() {
        return Comparator.comparingDouble(Employee::getSalary);
    }
}
