package ch.hesge.tp02.infrastructure;

public class Office {
    private int floor;
    private int idNumber;
    private Building building;

    public Office(int floor, int idNumber, Building building) {
        this.floor = floor;
        this.idNumber = idNumber;
        this.building = building;
    }
}
