package ch.hesge.tp02.employee;

public class Permanent extends TeachingEmployee {
    private double monthlySalary;

    public Permanent(String firstname, String lastname, String address, int experience, double monthlySalary) {
        super(firstname, lastname, address, experience);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
