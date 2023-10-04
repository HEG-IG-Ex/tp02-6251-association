import ch.hesge.tp02.employee.*;

public class Main {
    public static void main(String[] args) {
        UniversityDegree deg = new UniversityDegree("BSc Business Information System", 2023);

        Employee emp = new Permanent("Victor", "Hüni", "Rue du Test 46", deg, 5);
    }
}
