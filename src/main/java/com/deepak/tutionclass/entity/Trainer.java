package com.deepak.tutionclass.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "trainer")
@Data
public class Trainer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "trainer_id")
	private Integer trainerId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "mobile_no")
	private Integer mobileNo;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private List<Course> courseId;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "batch_id")
	private List<Batch> batchId;

}
