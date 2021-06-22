package com.studentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentservice.model.Student;
import com.studentservice.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping(path = "/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}

	@PutMapping(path = "/students")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}

	@GetMapping(path = "/students/greater/{age}")
	public List<Student> getGreaterTHan(@PathVariable int age) {
		List<Student> list = studentService.getGreaterThan(age);
		return list;
	}
	@GetMapping(path = "/students/less/{age}")
	public List<Student> getLessThan(@PathVariable int age){
		return studentService.getLessThan(age);
	}
	@GetMapping(path = "/students/greaterthanequal/{age}")
	public List<Student> findByAgeGreaterThanEqual(@PathVariable int age){
		return studentService. findByAgeGreaterThanEqual(age);
	}
	@GetMapping(path = "/students/agebetween")
	public List<Student> findByAgeBetween(@RequestParam int startAge ,@RequestParam int endAge ){
		return studentService.findByAgeBetween(startAge,endAge);
	}

}
