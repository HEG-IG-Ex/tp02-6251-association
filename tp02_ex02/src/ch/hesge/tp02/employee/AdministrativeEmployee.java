package ch.hesge.tp02.employee;

public class AdministrativeEmployee extends Employee{
    private Task task;

    public AdministrativeEmployee(String firstname, String lastname, String address, Degree degree, Task task) {
        super(firstname, lastname, address, degree);
        this.task = task;
    }
}
