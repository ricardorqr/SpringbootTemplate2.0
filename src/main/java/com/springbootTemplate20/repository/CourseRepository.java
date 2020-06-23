package com.springbootTemplate20.repository;

import com.springbootTemplate20.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

    public Course findByName(String name);
}
