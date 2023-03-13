package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		
		list=new ArrayList<>();
		list.add(new Course(145,"Java Core Course","this course contains basics of java"));
		list.add(new Course(146,"Spring Boot Course","craeting rest api using spring boot"));
		list.add(new Course(147,"Basic Spring Course","this course contains basics of spring"));
				
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course m=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				m=course;
				break;
			}
		}
		
		return m;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course, int id) {
		
		Course oldCourse = list.get(id);	
			
		oldCourse.setId(Course.getId());
		oldCourse.setTitle(course.getTitle());
		oldCourse.setDescription(course.getDescription());
		
		return oldCourse;
		
	}
	 
	/*
	public Course updateCourseCourse(Course c,int id) {
		Course x=null;
		for(Course course:list)
		{
			if(Course.getId()==id) {
				
				Course oldCourse=new Course();
				
			
			oldCourse.setId(course.getId());
			oldCourse.setTitle(course.getTitle());
			oldCourse.setDescription(course.getDescription());
			}
			
		}		
		return x;	
	} */


	@Override
	public Course deleteCourse(long courseId) {
		
		Course m=null;
		for(Course c:list)
		{
			if(c.getId()==courseId)
			{
				list.remove(c);
				break;
			}
		}
		
		return m; 
	}
}
