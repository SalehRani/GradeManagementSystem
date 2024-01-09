package model;

import java.time.LocalDate;

public class CourseGrade {
    private int id;
    private char letterGrade;

    public CourseGrade() {
    }

    public CourseGrade(int id, char letterGrade) {
        this.id = id;
        this.letterGrade = letterGrade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }
}
