package dk.cphbusiness.ja.generics.v2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Project {
  private final int id;
  private String title;
  private final Collection<Employee> workers = new HashSet<>();

  public Project(int id, String title) {
    this.id = id;
    this.title = title;
    }

  public int getId() { return id; }

  public String getTitle() { return title; }
  public void setTitle(String value) { title = value; }
  
  public Collection<Employee> getWorkers() { return workers; }
  
  void addWorker(Employee worker) {
    workers.add(worker);
    }

  public Collection<Department> getInvolvedDepartments() {
    Set<Department> departments = new HashSet<>();
    for (Employee worker : workers) departments.add(worker.getDepartment());
    return departments;
    }
  
  }
