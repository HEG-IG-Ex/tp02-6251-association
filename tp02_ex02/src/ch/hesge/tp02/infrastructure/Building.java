package ch.hesge.tp02.infrastructure;

import java.util.List;

public class Building {

    private String name;
    private String gpsCoodinates;
    private List<Office> offices;

    public Building(String name, String gpsCoodinates, List<Office> offices) {
        this.name = name;
        this.gpsCoodinates = gpsCoodinates;
        this.offices = offices;
    }

    public String getName() {
        return name;
    }

    public String getGpsCoodinates() {
        return gpsCoodinates;
    }

}
