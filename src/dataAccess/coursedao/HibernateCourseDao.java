package dataAccess.coursedao;

import entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile kurs eklenmiştir: "+course.getName());
    }
}
