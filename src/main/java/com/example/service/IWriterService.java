package com.example.service;

import java.util.List;

import com.example.entity.Writer;

public interface IWriterService {

	public Writer saveCourse(Writer writer);

	public List<Writer> getAllCourse();

	public Writer updateWriter(Writer writer);

	public Writer deleteWriterById(Integer wId);

	public Writer findByWriterId(Integer wId);

}
