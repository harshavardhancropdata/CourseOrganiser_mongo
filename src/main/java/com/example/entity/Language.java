package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Language {

	@Id
	private Integer lId;

	private String name;

//	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JsonManagedReference
//	@JoinColumn(name = "lId", referencedColumnName = "lId")
//	private List<Course> courses;

//	@ManyToOne
//	@JoinColumn(name = "course_id")
	private Course course;

	private Integer cId;


}