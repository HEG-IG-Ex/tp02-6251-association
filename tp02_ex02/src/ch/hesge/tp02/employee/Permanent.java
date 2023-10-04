package ch.hesge.tp02.employee;

public class Permanent extends TeachingEmployee {
    private double monthlySalary;


    public Permanent(String firstname, String lastname, String address, UniversityDegree ud, int experience) {
        super(firstname, lastname, address, ud, experience);
    }
    public Permanent(String firstname, String lastname, String address, UniversityDegree ud, int experience, double monthlySalary) {
        super(firstname, lastname, address, ud, experience);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
