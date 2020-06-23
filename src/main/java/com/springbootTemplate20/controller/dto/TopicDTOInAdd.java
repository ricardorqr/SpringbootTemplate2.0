package com.springbootTemplate20.controller.dto;

import com.springbootTemplate20.model.Course;
import com.springbootTemplate20.model.Topic;
import com.springbootTemplate20.repository.CourseRepository;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TopicDTOInAdd {

    @NotNull
    @NotEmpty
    @Length(min = 5, max = 200)
    private String title;
    @NotNull
    @NotEmpty
    @Length(min = 5, max = 200)
    private String message;
    @NotNull
    @NotEmpty
    @Length(min = 5, max = 200)
    private String courseName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Topic getTopic(CourseRepository courseRepository) {
        Course course = courseRepository.findByName(courseName);
        return new Topic(title, message, course);
    }

}
