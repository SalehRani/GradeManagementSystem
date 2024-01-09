package dao;

import model.Semester;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JdbcCourseGradeDao implements CourseGradeDao{
    private final JdbcTemplate jdbcTemplate;

    public JdbcCourseGradeDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Semester> getCourseGrades() {
        return null;
    }

    @Override
    public Semester getCourseGradeById(int id) {
        return null;
    }

    @Override
    public Semester getSemesterByLetterGrade(int id) {
        return null;
    }
}
