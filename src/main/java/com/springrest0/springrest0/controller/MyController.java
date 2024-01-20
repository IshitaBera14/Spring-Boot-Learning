package com.springrest0.springrest0.controller;


import com.springrest0.springrest0.entities.Course;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springrest0.springrest0.services.CourseService;

import java.util.List;

@RestController
public class MyController
{
   @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home()
    {
        return "welcome to courses application";
    }

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
          return courseService.getCourse();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course)
    {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
    {
       try{
          this.courseService.deleteCourse(Long.parseLong(courseId));
          return new ResponseEntity<>(HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }

    }
}
