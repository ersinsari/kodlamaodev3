import business.CategoryManager;
import business.CategoryService;
import business.CourseManager;
import business.CourseService;
import core.logging.DataBaseLogger;
import core.logging.EmailLogger;
import core.logging.Logger;
import dataAccess.categorydao.HibernateCategoryDao;
import dataAccess.coursedao.HibernateCourseDao;
import dataAccess.coursedao.JdbcCourseDao;
import entities.Category;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course=new Course(3,"java",100);
        Logger[] loggers={new DataBaseLogger(),new EmailLogger()};
        CourseService courseService=new CourseManager(new HibernateCourseDao(),loggers);
        courseService.add(course);



    }
}
