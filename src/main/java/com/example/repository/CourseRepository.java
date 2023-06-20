package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Course;
@Repository
public interface CourseRepository extends MongoRepository<Course, Integer> {

	public Course findByname(String courseName);

}
