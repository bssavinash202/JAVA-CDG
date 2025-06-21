package com.codegnan.studentrestspringdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentRepository repo;

	@PostMapping
	public String addStudent(@RequestBody Student student) {
		repo.save(student);
		return "Student added with ID: " + student.getId();
	}

	// list the students
	@GetMapping
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	// list the specific student
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable int id) {
		return repo.findById(id).orElse(new Student(0, "Not found", 0));
	}

	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		repo.deleteById(id);
		return "student deleted with ID: " + id;
	}

	@PutMapping("/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody Student student) {
		if (!repo.existsById(id)) {
			return "Student not found..!";
		}

		repo.save(student);
		return "Student updated with id: " + id;
	}

}
