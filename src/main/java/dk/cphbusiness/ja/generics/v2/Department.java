package dk.cphbusiness.ja.generics.v2;

import java.util.ArrayList;
import java.util.List;

public class Department {
  private final String code;
  private String name;
  
  private final List<Employee> employees = new ArrayList<>();

  public double totalSalary() {
    double total = 0.0;
    for (int i = 0; i < employees.size(); i++) {
      Employee employee = employees.get(i);
      total = total + employee.getSalary();
      }
    return total;
    }
  
  public List<Employee> getEmployees() { return employees; }
  
  public Department(String code, String name) {
    this.code = code;
    this.name = name;
    }

  public String getCode() { return code; }

  public String getName() { return name; }
  public void setName(String value) { this.name = value; }

  }
