package dk.cphbusiness.ja.generics.v1;

import java.util.ArrayList;
import java.util.List;

public class Department {
  private final String code;
  private String name;
  private final List employees = new ArrayList();

  public double totalSalary() {
    double total = 0.0;
    for (int i = 0; i < employees.size(); i++) {
      Employee employee = (Employee)employees.get(i);
      total = total + employee.getSalary();
      }
    return total;
    }
  
  public Department(String code, String name) {
    this.code = code;
    this.name = name;
    }

  public String getCode() { return code; }

  public String getName() { return name; }
  public void setName(String value) { this.name = value; }

  public List getEmployees() { return employees; }
  
  }
