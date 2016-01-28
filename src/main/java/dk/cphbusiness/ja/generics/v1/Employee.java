package dk.cphbusiness.ja.generics.v1;

public class Employee {
  private final int id;
  private String name;
  private double salary;
  private Department department;

  public Employee(int id, String name, double salary, Department department) {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.department = department;
    }

  public int getId() { return id; }

  public String getName() { return name; }
  public void setName(String value) { name = value; }

  public double getSalary() { return salary; }
  public void setSalary(double value) { salary = value; }

  public Department getDepartment() { return department; }
  
  public void setDepartment(Department value) { department = value; }
  
  }


