package ch.hesge.tp02.employee;

public class TeachingEmployee extends Employee{
    private int experience;

    public TeachingEmployee(String firstname, String lastname, String address, UniversityDegree ud, int experience) {
        super(firstname, lastname, address, ud);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
