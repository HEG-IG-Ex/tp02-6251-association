package ch.hesge.tp02.employee;

public class AdministrativeEmployee extends Employee{
    private Task task;

    public AdministrativeEmployee(String firstname, String lastname, String address, Task task) {
        super(firstname, lastname, address);
        this.task = task;
    }
}
