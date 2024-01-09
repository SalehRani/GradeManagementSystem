package dao;

import model.Semester;

import java.util.List;

public interface SemesterDao {
    /**
     * Get a list of all semesters from the datastore.
     * The list is never null. It is empty if there are no collections in the datastore.
     *
     * @return all semesters as a list of Semester objects
     */
    List<Semester> getSemesters();

    /**
     * Get a semester from the datastore that has a given id.
     * If the id is not found, return null.
     *
     * @param id the semester id to get from the datastore
     * @return a fully populated Semester object
     */
    Semester getSemesterById(int id);

    /**
     * Get a semester from the datastore that has a given year.
     * If the id is not found, return null.
     *
     * @param id the semester year to get from the datastore
     * @return a fully populated Semester object
     */
    Semester getSemesterByYear(int id);
}
