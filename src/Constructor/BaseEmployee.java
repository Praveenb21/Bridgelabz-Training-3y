package Constructor;

public class BaseEmployee {
    public int employeeID;
    protected String department;
    private double salary;

    BaseEmployee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class EmployeeManager extends BaseEmployee {
    String team;

    EmployeeManager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    void displayDetails() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: " + getSalary() + ", Team: " + team);
    }

    public static void main(String[] args) {
        EmployeeManager m = new EmployeeManager(2001, "IT", 75000, "Backend Team");
        m.displayDetails();
        m.setSalary(80000);
        m.displayDetails();
    }
}
