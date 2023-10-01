package ch.hesge.tp02.general;

import ch.hesge.tp02.employee.AdministrativeEmployee;
import ch.hesge.tp02.employee.Task;

import java.util.List;

public class Department {
    private String name;

    private List<Task> tasks;
    private List<AdministrativeEmployee> employees;


    public Department(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<AdministrativeEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<AdministrativeEmployee> employees) {
        this.employees = employees;
    }
}
