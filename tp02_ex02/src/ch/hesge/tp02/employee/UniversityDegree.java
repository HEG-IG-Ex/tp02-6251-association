package ch.hesge.tp02.employee;

public class UniversityDegree extends Degree{
    private int graduationYear;

    public UniversityDegree(String name, int graduationYear) {
        super(name);
        this.graduationYear = graduationYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
