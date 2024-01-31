package com.springrest0.springrest0.services;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import com.springrest0.springrest0.duo.CourseDuo;
import com.springrest0.springrest0.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

  //  List<Course> list;
    @Autowired
    public CourseDuo courseDuo;

    public CourseServiceImpl()
    {
      /*  list=new ArrayList<>();
        list.add(new Course(145,"java corecourse","this course"));
        list.add(new Course(4343 ,"abc","xyz"));*/
    }

    @Override
    public List<Course> getCourse() {
        return courseDuo.findAll();
    }
     @Override
   public Course getCourse(long courseId)
    {
       // Course c = null;
       /* for (Course course : list)
        {
            if(course.getId() == courseId)
            {
                c=course;
                break;
            }
        }*/
        return courseDuo.getOne(courseId);
    }
     @Override
    public Course addCourse(Course course){
    /*  list.add(course);*/
         courseDuo.save(course);
      return course;
    }


    public Course updateCourse(Course course){
     /*   list.forEach(e->{
            if(e.getId() == course.getId()){
                e.setTitle(course.getTitle());
                e.setDescription(course.getDescription());
            }
        });*/
        courseDuo.save(course);
        return course;
    }
    @Override
    public void deleteCourse(long parseLong){
      /*  list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());*/
        Course entity = courseDuo.getOne(parseLong);
        courseDuo.delete(entity);
    }

}
