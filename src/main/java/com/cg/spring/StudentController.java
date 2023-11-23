package com.cg.spring;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.*;
	 
	import java.util.List;
	import java.util.Optional;
	 
	@RestController
	@RequestMapping("/student1")
	public class StudentController {
	 
	    @Autowired
	    private StudentService studentService;
	 
	    @GetMapping("/all")
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }
	 
	    @GetMapping("/student1/{id}")
	    public ResponseEntity<Student> getStudentById(@PathVariable String id) {
	        Optional<Student> student = studentService.getStudentById(id);
	        return student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }
	 
	    @PostMapping("/add student")
	    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	        Student createdStudent = studentService.createStudent(student);
	        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudent);
	    }
	 
	    @PutMapping("/student1/{id}")
	    public ResponseEntity<Student> updateStudent(@PathVariable String id, @RequestBody Student updatedStudent) {
	        Optional<Student> updated = studentService.updateStudent(id, updatedStudent);
	        return updated.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	    }
	 
	    @DeleteMapping("/student1/{id}")
	    public ResponseEntity<Void> deleteStudent(@PathVariable String id) {
	        studentService.deleteStudent(id);
	        return ResponseEntity.noContent().build();
	    }
	}

