package com.springrest0.springrest0.duo;

import com.springrest0.springrest0.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDuo extends JpaRepository<Course, Long> {
}
