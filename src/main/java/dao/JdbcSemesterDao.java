package dao;

import model.Semester;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JdbcSemesterDao implements SemesterDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcSemesterDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Semester> getSemesters() {
        return null;
    }

    @Override
    public Semester getSemesterById(int id) {
        return null;
    }

    @Override
    public Semester getSemesterByYear(int id) {
        return null;
    }
}
