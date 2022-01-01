package com.greatlearning.studentfestevent.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.greatlearning.studentfestevent.entity.Student;

@Service
public interface StudentService {
	
	public List<Student> findAll();
	
	public Student	findById(int id);
	
	public void save(Student student);
	
	public void deletById(int id);
}