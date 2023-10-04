package ch.hesge.tp02.employee;

import ch.hesge.tp02.general.Person;
import ch.hesge.tp02.infrastructure.Office;

public class Employee extends Person {

    private Office office;
    private Degree degree;


    public Employee(String firstname, String lastname, String address, Degree degree) {
        super(firstname, lastname, address);
        this.office = null;
        this.degree = degree;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public double calculateSalary(){
        return 0;
    };

    public Degree getDegree() {
        return degree;
    }
}
