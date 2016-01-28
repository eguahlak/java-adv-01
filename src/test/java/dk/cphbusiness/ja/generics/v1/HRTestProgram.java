package dk.cphbusiness.ja.generics.v1;

public class HRTestProgram {
  
  public static void main(String[] args) {
    Department adm = new Department("ADM", "Administration");
    Department hr = new Department("HR", "Human Resources");
    Department it = new Department("IT", "IT");
    
    Employee kurt = new Employee(7, "Kurt Hansen", 25000.00, adm);
    Employee sonja = new Employee(9, "Sonja Jensen", 27000.00, hr);
    Employee ib = new Employee(13, "Ib Hansen", 30000.00, it);
    
    }
  
  }
