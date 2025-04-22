package JAVA;

public class employee {

    String name;
    int id;
    String department;
    double salary;

    public employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        employee emp1 = new employee("John Doe", 101, "Sales", 50000.0);
        employee emp2 = new employee("Jane Smith", 102, "Marketing", 60000.0);

        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
    }
}