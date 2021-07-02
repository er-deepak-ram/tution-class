package com.deepak.tutionclass.dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.deepak.tutionclass.entity.Course;

import lombok.Data;

@Data
public class StudentDto {

	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private Integer mobileNo;
	
	@Email
	private String email;
	
	@NotNull
	private List<Course> courseId;
}
