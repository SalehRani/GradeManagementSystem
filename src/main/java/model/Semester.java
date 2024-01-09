package model;

import java.time.LocalDate;
import java.util.Locale;

public class Semester {

    private int id;
    private String season;
    private LocalDate year;

    public Semester() {
    }

    public Semester(int id, String season, LocalDate year) {
            this.id = id;
            this.season = season;
            this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Semester {" +
                "id = " + id +
                ", season = " + season +
                ", year = " + year +
                "}";
    }
}
