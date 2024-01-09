package dao;

import model.Semester;

import java.util.List;

public interface CourseGradeDao {
    /**
     * Get a list of all semesters from the datastore.
     * The list is never null. It is empty if there are no collections in the datastore.
     *
     * @return all semesters as a list of Semester objects
     */
    List<Semester> getCourseGrades();

    /**
     * Get a coursegrade from the datastore that has a given id.
     * If the id is not found, return null.
     *
     * @param id the semester id to get from the datastore
     * @return a fully populated CourseGrade object
     */
    Semester getCourseGradeById(int id);

    /**
     * Get a coursegrade from the datastore that has a given year.
     * If the id is not found, return null.
     *
     * @param id the coursegrade letter to get from the datastore
     * @return a fully populated CourseGrade object
     */
    Semester getSemesterByLetterGrade(int id);
}
