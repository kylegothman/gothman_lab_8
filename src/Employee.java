public class Employee {
  private int id;
  private String name;

  // Constructor
  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public String toString() {
    return "Employee name: " + name + ", id: " + id + "";
  }

}
