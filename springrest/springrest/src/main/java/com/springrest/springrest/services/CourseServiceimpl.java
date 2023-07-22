package com.springrest.springrest.services;

import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;

import com.springrest.springrest.dao.CourseDao;
//import com.springrest.springrest.entities.*;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
		public CourseServiceimpl() {
		
//			list = new ArrayList<>();
//			
//			list.add(new Course(1, "Java", "This is core java course"));
//			
//			list.add(new Course(2, "Python", "This is Python course"));
			
	}

	//Get all courses
	@Override
	public List<Course> getCourses() {
		
		//return list;
		return courseDao.findAll();
	}
	
	//get single course by id
	@Override
	public Course getCourse(long courseId) {
				
//		Course c = null;
//		for(Course course:list)
//		{
//		if(course.getId()==courseId) {
//			c=course;
//				break;
//			}
//		}
		//return c;
		
		return courseDao.getById(courseId);
	}


	//add a new course
	@Override
	public Course addCourse(Course course) {
		
	//  list.add(course);
		//return course;
		courseDao.save(course);
		return course;
		
	}

	//update a course
	@Override
	public Course updateCourse(Course course) {

//		list.forEach(e ->{ 
//			if (e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());	
//			}
//	
//		});
		courseDao.save(course);
		return course;				
	}
	@Override
	public void deleteCourse(long parseLong) {
		
	// list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		Course entity = courseDao.getById(parseLong);
		courseDao.delete(entity);
	}


	
}
