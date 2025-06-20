package com.spring.firstspringbootapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
	private Map<Integer, Student> studentdb = new HashMap<>();

	// create
	// http://localhost:8080/students with POST
	@PostMapping
	public String addStudent(@RequestBody Student student) {
		studentdb.put(student.getId(), student);
		return "student added Successfully with ID: " + student.getId();
	}

	// http://localhost:8080/students/1 with GET request
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable int id) {
//		return studentdb.get(id);
		return studentdb.getOrDefault(id, new Student(0, "Unknown student", 0));
	}
	// retrieve
	// update
	// delete

}
