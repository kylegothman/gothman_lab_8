import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
  private Map<Integer, Employee> employeeMap;
  
  public EmployeeMap() {
    employeeMap = new HashMap<>();
  }

  public void addEmployee(Employee employee) {
    employeeMap.put(employee.getId(), employee);
  }

  public void removeEmployee(int id) {
    employeeMap.remove(id);
  } 

  public Employee getEmployee(int id) {
    return employeeMap.get(id);
  }

}
