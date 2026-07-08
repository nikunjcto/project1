package com.RBU.project1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RBU.project1.Models.Students;
import com.RBU.project1.Repositries.Repos;

@Service
public class Serv {
	@Autowired
	Repos repo;
	
	public void saveStudent(Students s) {
		repo.save(s);
	}
	
	public List<Students> getStudents() {
		return repo.findAll();
	}
	
	public Optional<Students> getStudent(Long id) {
		return repo.findById(id);
	}
	
	public Students update(Students new_std) {
		Students old_std = repo.getById(new_std.getRoll());
		old_std.setRoll(new_std.getRoll());
		old_std.setName(new_std.getName());
		old_std.setBranch(new_std.getBranch());
		
		repo.save(old_std);
		return old_std;
	}
	
	public void deleteStudent(Long id) {
		repo.deleteById(id);
	}
}
