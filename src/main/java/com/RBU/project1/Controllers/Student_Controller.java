package com.RBU.project1.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RBU.project1.Models.Students;
import com.RBU.project1.Services.Serv;

@RestController
@RequestMapping("/student")
public class Student_Controller {
	@Autowired
	Serv serv;
	
	@PostMapping("/save")
	public void saveStd(@RequestBody Students s) {
		serv.saveStudent(s);
	}
	
	@GetMapping("/getall")
	public List<Students> getAllStd(){
		return serv.getStudents();
	}
	
	@GetMapping ("/getstudent/{id}")
	public Optional<Students> getStudent(@PathVariable Long id) {
		return serv.getStudent(id);
	}
	
	@PutMapping("/update")
	public Students updateStudent(@RequestBody Students s) {
		return serv.update(s);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		serv.deleteStudent(id);
	}
}
