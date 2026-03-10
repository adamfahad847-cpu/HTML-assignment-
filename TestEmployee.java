class Employee {

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {

    double calculateSalary() {
        return 70000;
    }
}

class PartTimeEmployee extends Employee {

    double calculateSalary() {
        return 30000;
    }
}

public class TestEmployee {

    public static void main(String[] args) {

        Employee f = new FullTimeEmployee();
        Employee p = new PartTimeEmployee();

        System.out.println("Full Time Salary: " + f.calculateSalary());
        System.out.println("Part Time Salary: " + p.calculateSalary());
    }
}