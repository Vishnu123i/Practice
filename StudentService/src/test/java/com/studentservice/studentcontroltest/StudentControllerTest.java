package com.studentservice.studentcontroltest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.studentservice.controller.StudentController;
import com.studentservice.model.Course;
import com.studentservice.model.Student;
import com.studentservice.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {
	@Mock
	StudentService studentService;
	@InjectMocks
	StudentController studentController;

	@Test
	void createStudenTest() {
		Student student = new Student();
		Course courses = new Course();
		courses.setId(1);
		courses.setTitle("Nitisha no 1");
		Course coursess = new Course();
		coursess.setId(2);
		coursess.setTitle("Meghana no 101");

		student.setStudentId(1);
		student.setFirstName("vishnu");
		student.setLastName("reddy");
		student.setEmail("vishnu@gmail.com");
		student.setCourses(Arrays.asList(courses, coursess));

		Mockito.when(studentService.createStudent(student)).thenReturn(student);

		Student returnStudent = studentController.createStudent(student);
		Assertions.assertEquals(1, returnStudent.getStudentId());
		Assertions.assertEquals("vishnu", returnStudent.getFirstName());
	}

	@Test
	void UpdateStudentTest() {
		Student student1 = new Student();

		Course course = new Course();
		course.setId(1);
		course.setTitle("madhavi ne no 100");
		Course course2 = new Course();
		course2.setId(2);
		course2.setTitle("Vishnu the king");

		student1.setStudentId(1);
		student1.setFirstName("Srikanth");
		student1.setLastName("Reddy");
		student1.setEmail("rrr@gmail.com");
		student1.setCourses(Arrays.asList(course, course2));

		Mockito.when(studentService.updateStudent(student1)).thenReturn(student1);

		Student returnStudent1 = studentController.updateStudent(student1);
		Assertions.assertEquals(2, returnStudent1.getCourses().get(1).getId());
		Assertions.assertEquals("Reddy", returnStudent1.getLastName());
		Assertions.assertEquals("Srikanth", returnStudent1.getFirstName());
		Assertions.assertEquals("rrr@gmail.com", returnStudent1.getEmail());
		Assertions.assertEquals("madhavi ne no 100", returnStudent1.getCourses().get(0).getTitle());
	}

	@Test
	void getGreaterThanTest() {
		Student student1 = new Student();

		Course course = new Course();
		course.setId(1);
		course.setTitle("madhavi ne no 100");
		Course course2 = new Course();
		course2.setId(2);
		course2.setTitle("Vishnu the king");

		student1.setStudentId(1);
		student1.setFirstName("Srikanth");
		student1.setLastName("Reddy");
		student1.setEmail("rrr@gmail.com");
		student1.setAge(25);
		student1.setCourses(Arrays.asList(course, course2));

		Student student2 = new Student();
		Course course3 = new Course();
		course3.setId(1);
		course3.setTitle("madhavi ne no 100");
		Course course4 = new Course();
		course4.setId(2);
		course4.setTitle("Vishnu the king");

		student2.setStudentId(1);
		student2.setFirstName("vishnu");
		student2.setLastName("Reddy");
		student2.setEmail("abc@gmail.com");
		student2.setAge(24);
		student2.setCourses(Arrays.asList(course, course2));

		List<Student> list = Arrays.asList(student1, student2);
		Mockito.when(studentService.getGreaterThan(23))
				.thenReturn(list.stream().filter(p -> p.getAge() > 23).collect(Collectors.toList()));

		List<Student> returnList = studentController.getGreaterTHan(23);
		Assertions.assertEquals(2, returnList.size());
		Assertions.assertEquals("Srikanth", returnList.get(0).getFirstName());
		Assertions.assertEquals("abc@gmail.com", returnList.get(1).getEmail());
	}

	@Test
	void getLessThanTest() {
		Student student3 = new Student();

		Course course5 = new Course();
		course5.setId(1);
		course5.setTitle("madhavi ne no 100");
		Course course6 = new Course();
		course6.setId(2);
		course6.setTitle("Vishnu the king");

		student3.setStudentId(1);
		student3.setFirstName("Srikanth");
		student3.setLastName("Reddy");
		student3.setEmail("rrr@gmail.com");
		student3.setAge(23);
		student3.setCourses(Arrays.asList(course5, course6));

		Student student4 = new Student();
		Course course7 = new Course();
		course7.setId(1);
		course7.setTitle("madhavi ne no 100");
		Course course8 = new Course();
		course8.setId(2);
		course8.setTitle("Vishnu the king");

		student4.setStudentId(1);
		student4.setFirstName("vishnu");
		student4.setLastName("Reddy");
		student4.setEmail("xyz@gmail.com");
		student4.setAge(25);
		student4.setCourses(Arrays.asList(course7, course8));
		List<Student> list1 = Arrays.asList(student3, student4);
		Mockito.when(studentService.getLessThan(29))
				.thenReturn(list1.stream().filter(p -> p.getAge() < 29).collect(Collectors.toList()));

		List<Student> returnList = studentController.getLessThan(29);
		Assertions.assertEquals(2, returnList.size());
		Assertions.assertEquals("xyz@gmail.com", returnList.get(1).getEmail());
		Assertions.assertEquals("Reddy", returnList.get(0).getLastName());
	}

	@Test
	void findByAgeGreaterThanEqualTest() {
		Course course8 = new Course();
		course8.setId(1);
		course8.setTitle("Meghana jhansi both are close friends");
		Course course9 = new Course();
		course9.setId(2);
		course9.setTitle("Nitisha Jhansi both are colleauges");

		Student student5 = new Student();
		student5.setStudentId(1);
		student5.setFirstName("Mahesh");
		student5.setLastName("Babu");
		student5.setEmail("VVV@gmail.com");
		student5.setAge(22);
		student5.setCourses(Arrays.asList(course8, course9));

		Course course10 = new Course();
		course10.setId(1);
		course10.setTitle("Started");
		Course course11 = new Course();
		course11.setId(2);
		course11.setTitle("Finished");
		Student student6 = new Student();
		student6.setStudentId(1);
		student6.setFirstName("Sampornesh");
		student6.setLastName("Babu");
		student6.setEmail("VVV@gmail.com");
		student6.setAge(22);
		student6.setCourses(Arrays.asList(course10, course11));
		List<Student> list2 = Arrays.asList(student5, student6);

		Mockito.when(studentService.findByAgeGreaterThanEqual(22))
				.thenReturn(list2.stream().filter(p -> p.getAge() >= 22).collect(Collectors.toList()));

		List<Student> returnList2 = studentController.findByAgeGreaterThanEqual(22);
		Assertions.assertEquals(2, returnList2.size());
		Assertions.assertEquals("Meghana jhansi both are close friends",
				returnList2.get(0).getCourses().get(0).getTitle());
		Assertions.assertEquals("Sampornesh", returnList2.get(1).getFirstName());

	}

	@Test
	void findByAgeBetweenTest() {
		Course course12 = new Course();
		course12.setId(1);
		course12.setTitle("King");
		Course course13 = new Course();
		course13.setId(2);
		course13.setTitle("Queen");

		Student student7 = new Student();
		student7.setStudentId(1);
		student7.setFirstName("Allu");
		student7.setLastName("Arjun");
		student7.setEmail("MMM@gmail.com");
		student7.setAge(24);
		student7.setCourses(Arrays.asList(course12, course13));

		Course course14 = new Course();
		course14.setId(1);
		course14.setTitle("Started");
		Course course15 = new Course();
		course15.setId(2);
		course15.setTitle("Finished");
		Student student8 = new Student();
		student8.setStudentId(2);
		student8.setFirstName("Sampornesh");
		student8.setLastName("Babu");
		student8.setEmail("VVV@gmail.com");
		student8.setAge(25);
		student8.setCourses(Arrays.asList(course14, course15));
		List<Student> list3 = Arrays.asList(student7, student8);

		Mockito.when(studentService.findByAgeBetween(23, 29)).thenReturn(
				list3.stream().filter(p -> p.getAge() > 23 && p.getAge() < 29).collect(Collectors.toList()));

		   List<Student> returnList4 = studentController.findByAgeBetween(23, 29);
		   
		   Assertions.assertEquals(2, returnList4.size());
		   Assertions.assertEquals(1, returnList4.get(0).getStudentId());
		   Assertions.assertEquals("Babu", returnList4.get(1).getLastName());
	}
}