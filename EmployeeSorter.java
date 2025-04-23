import java.util.*;

class Employee implements Comparable<Employee> {
    int emp_id, year_of_joining;
    String emp_name, emp_gender;

    Employee(int emp_id, String emp_name, String emp_gender, int year_of_joining) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_gender = emp_gender;
        this.year_of_joining = year_of_joining;
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(year_of_joining, e.year_of_joining);
    }

    @Override
    public String toString() {
        return emp_id + ": " + emp_name + ", " + emp_gender + ", " + year_of_joining;
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Alice", "Female", 2015),
            new Employee(102, "Bob", "Male", 2018),
            new Employee(103, "Charlie", "Male", 2012),
            new Employee(104, "Diana", "Female", 2020)
        );

        // Sort using Comparable
        Collections.sort(employees);
        employees.forEach(System.out::println);

        // Sort using Comparator
        employees.sort(Comparator.comparingInt(e -> e.year_of_joining));
        System.out.println("\nSorted by Comparator:");
        employees.forEach(System.out::println);
    }
}
