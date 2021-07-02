package com.deepak.tutionclass.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "course")
@Data
public class Course implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "course_id")
	private Integer courseId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "fees")
	private Double fees;
	
	@Column(name = "duration")
	private Integer duration;
}
