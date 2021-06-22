package com.studentservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentservice.dao.StudentDao;
import com.studentservice.model.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;

	public Student createStudent(Student student) {

		return studentDao.saveStudent(student);
	}

	public Student updateStudent(Student student) {

		return studentDao.updateStudent(student);
	}

	public List<Student> getGreaterThan(int age) {
		
		return studentDao.getGreaterThan(age);
	}

	public List<Student> getLessThan(int age) {
		
		return studentDao.getLessThan(age);
	}

	public List<Student> findByAgeGreaterThanEqual(int age) {
		
		return studentDao.findByAgeGreaterThanEqual(age);
	}

	public List<Student> findByAgeBetween(int startAge, int endAge) {
		
		return studentDao.findByAgeBetween(startAge,endAge);
	}

}
