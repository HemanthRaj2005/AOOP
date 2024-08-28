import java.util.Objects;

public class Employee implements Comparable<Employee>, Cloneable {
    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id); // Natural ordering by employee ID
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone(); // Shallow copy; for deep copy, clone mutable fields as well
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
