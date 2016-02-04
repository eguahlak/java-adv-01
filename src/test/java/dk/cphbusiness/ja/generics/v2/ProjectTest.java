package dk.cphbusiness.ja.generics.v2;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProjectTest {
  Department it = new Department("IT", "IT Department");
  Department adm = new Department("ADM", "Administration");
  Employee kurt = new Employee(7, "Kurt", 30000, adm);
  Employee sonja = new Employee(17, "Sonja", 34000, it);
  Project p1 = new Project(1, "TimeEdit");
  Project p2 = new Project(2, "Fronter");
  Project p3 = new Project(3, "Outlook");
  
  @Test
  public void testManyToMany() {
    kurt.add(p1).add(p2).add(p3);
    sonja.add(p2);
    assertThat(p2.getWorkers(), containsInAnyOrder(kurt, sonja));
    assertThat(p1.getWorkers(), containsInAnyOrder(kurt));
    assertThat(kurt.getProjects(), containsInAnyOrder(p1, p2, p3));
    }

  @Test
  public void testGetInvolvedDepartments() {
    kurt.add(p1).add(p2).add(p3);
    sonja.add(p2);
    assertThat(p2.getInvolvedDepartments(), containsInAnyOrder(it, adm));
    assertThat(p2.getInvolvedDepartments().size(), is(2));
    }

  }
