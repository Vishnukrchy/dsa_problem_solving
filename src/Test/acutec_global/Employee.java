package Test.acutec_global;

import java.util.ArrayList;
import java.util.Arrays;

/*
@Author :vishnu
Test :2025-06-27 10:
Problem Understanding:
Given an employee class with no attributes or methods, this class serves as a placeholder for future development.
Problem Statement:
Compare two employee objects to determine if they are equal. by name, id, or any other criteria.
 */
public class Employee {
    int id;
    String name;
    String department;
    String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both references point to the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type
        Employee employee = (Employee) obj; // Cast the object to Employee
        return id == employee.id && name.equals(employee.name); // Compare id and name for equality
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice", "Engineering", "Software Engineer");
        Employee emp2 = new Employee(1, "Alice", "Engineering", "Software Engineer");
        Employee emp3 = new Employee(2, "Bob", "Marketing", "Marketing Manager");

        System.out.println("emp1 equals emp2: " + emp1.equals(emp2)); // Should print true
        System.out.println("emp1 equals emp3: " + emp1.equals(emp3)); // Should print false

        //Q1 Compare employee objects by name
        System.out.println("emp1 name equals emp2 name: " + emp1.name.equals(emp2.name)); // Should print true
        //Q1 Compare two employee list  by name  using stream API
        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(emp1, emp2, emp3));
        long count = employees.stream()
                .filter(e -> e.name.equals("Alice"))
                .count();
        System.out.println("Count of employees with name 'Alice': " + count); // Should print 2
        //Q2 Compare employee objects by id
        System.out.println("emp1 id equals emp2 id: " + (emp1.id == emp2.id)); // Should print true
        //Q2 Compare two employee list  by id  using stream API
        long idCount = employees.stream()
                .filter(e -> e.id == 1)
                .count();
        System.out.println("Count of employees with id 1: " + idCount); // Should print 2
        //Q3 Compare employee objects by department
        System.out.println("emp1 department equals emp2 department: " + emp1.department.equals(emp2.department)); // Should print true
        //Q3 Compare two employee list  by department  using stream API
        long departmentCount = employees.stream()
                .filter(e -> e.department.equals("Engineering"))
                .count();


    }
}
