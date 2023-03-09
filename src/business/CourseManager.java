package business;

import core.logging.Logger;
import dataAccess.coursedao.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager implements CourseService{
    private CourseDao courseDao;
    private Logger[] logger;
    private List<Course> courses =new ArrayList<>();


    public CourseManager(CourseDao courseDao, Logger[] logger) {
        this.courseDao = courseDao;
        this.logger = logger;
    }

    @Override
    public void add(Course course) throws Exception {
        for(Course course1:courses){
            if(course1.getName().equals(course.getName())){
                throw new Exception("bu isimde kurs bulunmaktadır.");
            }
        }
        for(Logger logger1:logger){
            logger1.log("merhaba");
        }
        if(course.getUnitPrice()<0){
            throw new Exception("ürünün fiyatı 0 dan küçük olamaz");
        }
        courseDao.add(course);
        courses.add(course);


    }
}
