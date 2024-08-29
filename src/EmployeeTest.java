public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee("Sabin", 23, "Backend", 30000.0);

        Manager manager = new Manager("Priya", 30,  40000.0, "Sales", 10000.0 );

        System.out.println("***** Employee and Manager Information Before Salary Raise *****\n");
        System.out.println("Employee Information:");
        employee.displayEmployeeInfo();
        System.out.println();
        System.out.println("Manager Information:");
        manager.displayEmployeeInfo();
        System.out.println();
        System.out.println("---------------------------------------------------------------\n");

        employee.raiseSalary(10);
        manager.raiseSalary(10);

        // Display updated information of both Employee and Manager after salary raise
        System.out.println("***** Employee and Manager Information After Salary Raise *****\n");
        System.out.println("Employee Information:");
        employee.displayEmployeeInfo();
        System.out.println();
        System.out.println("Manager Information:");
        manager.displayEmployeeInfo();
        System.out.println();
        System.out.println("---------------------------------------------------------------\n");
    }
}