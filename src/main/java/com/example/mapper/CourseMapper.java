package com.example.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.dto.CourseDTO;
import com.example.entity.Course;

@Mapper(componentModel = "spring", uses = { LanguageMapper.class, WriterMapper.class })
public interface CourseMapper {

//	@Mapping(source = "writerDTOs", target = "course.writer")
//	@Mapping(source = "languageDTOs", target = "language")
	public Course toCourse(CourseDTO courseDTO);

//	@Mapping(source = "course.writer", target = "writerDTOs")
//	@Mapping(source = "language", target = "languageDTOs")
	public CourseDTO toCourseDTO(Course course);
}
