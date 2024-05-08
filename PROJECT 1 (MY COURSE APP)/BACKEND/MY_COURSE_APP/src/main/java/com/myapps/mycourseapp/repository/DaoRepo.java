package com.myapps.mycourseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapps.mycourseapp.model.Course;

public interface DaoRepo extends JpaRepository<Course,Integer>{

}
