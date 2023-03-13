package com.example.demo.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseService;

@RestController
public class Controller {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/")
	public String home() {
		return "Welcome to home page!!";
	}
	
	//get the courses	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
		
	}
	
	//single course get
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
		
	}

	//course add
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);		
	}
	
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@RequestBody Course course, @PathVariable int id) 
	{
		return this.courseService.updateCourse(course, id);		
	}
	
	@DeleteMapping("/courses/{courseId}")
	public Course deleteCourse(@PathVariable String courseId)
	{
		return this.courseService.deleteCourse(Long.parseLong(courseId));
	}
}  



