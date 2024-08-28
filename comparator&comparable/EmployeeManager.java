import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager implements Iterable<Employee> {
    private final List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortById() {
        Collections.sort(employees); // Sort by natural order (ID)
    }

    public void sortByName() {
        employees.sort(EmployeeComparators.byName()); // Sort by name
    }

    public void sortBySalary() {
        employees.sort(EmployeeComparators.bySalary()); // Sort by salary
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator(); // Provide iterator functionality
    }

    public List<Employee> cloneEmployeeList() throws CloneNotSupportedException {
        List<Employee> clonedList = new ArrayList<>();
        for (Employee employee : employees) {
            clonedList.add(employee.clone()); // Clone each employee
        }
        return clonedList;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee(3, "Alice", 75000));
        manager.addEmployee(new Employee(1, "Bob", 60000));
        manager.addEmployee(new Employee(2, "Charlie", 70000));

        System.out.println("Original List:");
        manager.printEmployees();

        System.out.println("\nSorted by ID:");
        manager.sortById();
        manager.printEmployees();

        System.out.println("\nSorted by Name:");
        manager.sortByName();
        manager.printEmployees();

        System.out.println("\nSorted by Salary:");
        manager.sortBySalary();
        manager.printEmployees();

        System.out.println("\nCloned Employee List:");
        List<Employee> clonedEmployees = manager.cloneEmployeeList();
        clonedEmployees.forEach(System.out::println);
    }
}
