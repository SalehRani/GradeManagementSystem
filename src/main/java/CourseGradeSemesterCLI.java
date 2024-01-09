import dao.CourseGradeDao;
import dao.JdbcCourseGradeDao;
import dao.JdbcSemesterDao;
import dao.SemesterDao;
import org.apache.commons.dbcp2.BasicDataSource;
import view.Menu;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.*;
import java.util.Scanner;


public class CourseGradeSemesterCLI {

    private static final String MAIN_MENU_OPTION_CG = "View and Manage Course Grades";
    private static final String MAIN_MENU_OPTION_SEMESTERS = "View and Manage Semesters";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = new String[] { MAIN_MENU_OPTION_CG,
                                                                     MAIN_MENU_OPTION_SEMESTERS,
                                                                     MAIN_MENU_OPTION_EXIT };

    private static final String MENU_OPTION_RETURN_TO_MAIN = "Return to main menu";

    private static final String CG_MENU_OPTION_ALL_COURSEGRADES = "Show all course grades";
    private static final String CG_MENU_OPTION_CREATE_COURSEGRADE = "INSERT new course grade";
    private static final String CG_MENU_OPTION_UPDATE_COURSEGRADE = "Upgrade course grade";
    private static final String CG_MENU_OPTION_DELETE_COURSEGRADE = "Delete course grade";
    private static final String CG_MENU_OPTION_DELETE_COURSEGRADES_FROM_SEMESTER = "Delete ALL coursegrades from a semester";

    private static final String[] COURSEGRADE_MENU_OPTIONS = new String[] { CG_MENU_OPTION_ALL_COURSEGRADES,
                                                                            CG_MENU_OPTION_CREATE_COURSEGRADE,
                                                                            CG_MENU_OPTION_UPDATE_COURSEGRADE,
                                                                            CG_MENU_OPTION_DELETE_COURSEGRADE,
                                                                            CG_MENU_OPTION_DELETE_COURSEGRADES_FROM_SEMESTER};

    private static final String SEMESTER_MENU_OPTION_ALL_SEMESTERS = "Show all semesters";
    private static final String SEMESTER_MENU_OPTION_SEARCH_BY_SEMESTER = "Search by semester";
    private static final String SEMESTER_MENU_OPTION_CREATE_SEMESTER = "INSERT new semester";
    private static final String SEMESTER_MENU_OPTION_UPDATE_SEMESTER = "Update semester";
    private static final String SEMESTER_MENU_OPTION_DELETE_SEMESTER = "Delete semester";
    private static final String[] SEMESTER_MENU_OPTIONS = new String[] { SEMESTER_MENU_OPTION_ALL_SEMESTERS,
                                                                         SEMESTER_MENU_OPTION_SEARCH_BY_SEMESTER,
                                                                         SEMESTER_MENU_OPTION_CREATE_SEMESTER,
                                                                         SEMESTER_MENU_OPTION_UPDATE_SEMESTER,
                                                                         SEMESTER_MENU_OPTION_DELETE_SEMESTER };

    private final Menu menu;
    private final CourseGradeDao cgDao;
    private final SemesterDao semesterDao;

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        String databaseUrl = "jdbc:postgresql://localhost:5432/CourseGradeDB";
        dataSource.setUrl(databaseUrl);
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        CourseGradeSemesterCLI app = new CourseGradeSemesterCLI(dataSource);
        app.run();
    }

    public CourseGradeSemesterCLI(DataSource dataSource) {
        this.menu = new Menu(System.in, System.out);

        cgDao = new JdbcCourseGradeDao(dataSource);
        semesterDao = new JdbcSemesterDao(dataSource);
    }

    public void run() {
        displayApplicationBanner();
        boolean running = true;
        while (running) {
            printHeading("Main Menu");
            String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
            switch (choice) {
                case MAIN_MENU_OPTION_CG:
                    //handleCourseGrades();
                    break;
                case MAIN_MENU_OPTION_SEMESTERS:
                    //handleSemesters();
                    break;
                case MAIN_MENU_OPTION_EXIT:
                    running = false;
                    break;
            }
        }
    }

    private void printHeading(String headingText) {
        System.out.println(("\n" + headingText));

        for (int i = 0; i < headingText.length(); i++) {
            System.out.print("-");
        }

        System.out.println();
    }

    private String getUserInput(String prompt) {
        System.out.print(prompt + ">>> ");
        return new Scanner(System.in).nextLine();
    }

    private void displayError(String message) {
        System.out.println();
        System.out.print("***" + message + "***");
    }

    private void displayApplicationBanner() {
        System.out.println(" .----------------.  .----------------.  .----------------.  .----------------. ");
        System.out.println("| .--------------. || .--------------. || .--------------. || .--------------. |");
        System.out.println("| |     ______   | || |    ______    | || |  ________    | || |   ______     | |");
        System.out.println("| |   .' ___  |  | || |  .' ___  |   | || | |_   ___ `.  | || |  |_   _ \\    | |");
        System.out.println("| |  / .'   \\_|  | || | / .'   \\_|   | || |   | |   `. \\ | || |    | |_) |   | |");
        System.out.println("| |  | |         | || | | |    ____  | || |   | |    | | | || |    |  __'.   | |");
        System.out.println("| |  \\ `.___.'\\  | || | \\ `.___]  _| | || |  _| |___.' / | || |   _| |__) |  | |");
        System.out.println("| |   `._____.'  | || |  `._____.'   | || | |________.'  | || |  |_______/   | |");
        System.out.println("| |              | || |              | || |              | || |              | |");
        System.out.println("| '--------------' || '--------------' || '--------------' || '--------------' |");
        System.out.println(" '----------------'  '----------------'  '----------------'  '----------------' ");
    }
}
