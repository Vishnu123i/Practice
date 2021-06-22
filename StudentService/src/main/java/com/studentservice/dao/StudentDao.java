package com.studentservice.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentservice.model.Student;
import com.studentservice.repository.StudentRepository;

@Repository
@Transactional
public class StudentDao {
	@Autowired
	StudentRepository studentRepository;

	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	public List<Student> getGreaterThan(int age) {
		
		return studentRepository.findByAgeGreaterThan(age);
	}

	public List<Student> getLessThan(int age) {
		
		return studentRepository.findByAgeLessThan(age);
	}

	public List<Student> findByAgeGreaterThanEqual(int age) {
		
		return studentRepository.findByAgeGreaterThanEqual(age);
	}

	public List<Student> findByAgeBetween(int startAge, int endAge) {
		
		return studentRepository.findByAgeBetween(startAge,endAge);
	}

}
