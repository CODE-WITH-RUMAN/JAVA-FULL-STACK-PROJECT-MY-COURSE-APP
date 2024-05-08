package com.myapps.mycourseapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapps.mycourseapp.model.Course;
import com.myapps.mycourseapp.service.DaoService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class AppController {
	
	@Autowired
	DaoService service;

	@GetMapping("/")
	public String Home() {
		return "WELCOME TO MY APP";
	}
	
	@GetMapping("/Course")
	public List<Course> GetData() {
		return service.GetData();
	}
	
	@GetMapping("/Course/{cid}")
	public Optional<Course> GetData(@PathVariable int cid) {
		return service.GetData(cid);
	}
	
	@PostMapping("/Course")
	public String PostData(@RequestBody Course course){
		service.PostData(course);
		return "POSTED";
	}
	
	@PutMapping("/Course")
	public String PutData(@RequestBody Course course){
		service.PostData(course);
		return "UPDATED";
	}
	
	@DeleteMapping("/Course/{cid}")
	public String DeleteData(@PathVariable int cid) {
		service.DeleteData(cid);
		return "DELETED";
	}
	
	@DeleteMapping("/Course")
	public String DeleteData() {
		service.DeleteAllData();
		return "DELETED ALL";
	}
}
