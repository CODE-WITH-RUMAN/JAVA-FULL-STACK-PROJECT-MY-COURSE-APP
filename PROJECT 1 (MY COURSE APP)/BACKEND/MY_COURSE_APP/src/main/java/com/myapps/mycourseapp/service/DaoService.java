package com.myapps.mycourseapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapps.mycourseapp.model.Course;
import com.myapps.mycourseapp.repository.DaoRepo;

@Service
public class DaoService {
	@Autowired
	DaoRepo daorepo;
	
	public List<Course> GetData() {
		return daorepo.findAll();
	}
	
	public Optional<Course> GetData(int cid) {
		return daorepo.findById(cid);
	}
	
	public Course PostData(Course course) {
		return daorepo.save(course);
	}
	
	public void DeleteData(int cid) {
		daorepo.deleteById(cid);
	}
	
	public void DeleteAllData() {
		daorepo.deleteAll();
	}

}
