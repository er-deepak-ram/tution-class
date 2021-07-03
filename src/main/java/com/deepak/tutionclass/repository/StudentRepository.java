package com.deepak.tutionclass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.tutionclass.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
