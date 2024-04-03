public class EmployeeMapDemo {
    public static void main(String[] args) {
        // Create emplyees
        Employee employee1 = new Employee(1, "Nicola Tesla");
        Employee employee2 = new Employee(2, "Thomas Edison");

        // Create EmployeeMap
        EmployeeMap employeeMap = new EmployeeMap();
        employeeMap.addEmployee(employee1);
        employeeMap.addEmployee(employee2);

        // 
        System.out.println("Employee with ID 1: " + employeeMap.getEmployee(1));
        System.out.println("Employee with ID 2: " + employeeMap.getEmployee(2));
    }
}
