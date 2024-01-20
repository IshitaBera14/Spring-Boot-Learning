package com.springrest0.springrest0.services;

import com.springrest0.springrest0.entities.Course;

import java.util.List;
public interface CourseService {

    public List<Course> getCourse();
    public Course getCourse(long courseId);

    public Course addCourse(Course course);


    Course updateCourse(Course course);


    public void deleteCourse(long parseLong);
}
