package ch.hesge.tp02.employee;

public class Contractor extends TeachingEmployee{
    private double hoursTaught;
    private double hourlyRate;

    public Contractor(String firstname, String lastname, String address, UniversityDegree ud,  int experience) {
        super(firstname, lastname, address, ud, experience);
    }

    public Contractor(String firstname, String lastname, String address, UniversityDegree ud,  int experience, double hoursTaught, double hourlyRate) {
        super(firstname, lastname, address, ud, experience);
        this.hoursTaught = hoursTaught;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursTaught() {
        return hoursTaught;
    }

    public void setHoursTaught(double hoursTaught) {
        this.hoursTaught = hoursTaught;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursTaught * hourlyRate;
    }
}
