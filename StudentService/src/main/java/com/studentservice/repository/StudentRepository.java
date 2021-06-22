package com.studentservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentservice.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByAgeGreaterThan(int age);

	List<Student> findByAgeLessThan(int age);

	List<Student> findByAgeGreaterThanEqual(int age);

	List<Student> findByAgeBetween(int startAge, int endAge);

	

}
