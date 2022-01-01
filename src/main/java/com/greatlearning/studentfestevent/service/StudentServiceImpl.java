package com.greatlearning.studentfestevent.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greatlearning.studentfestevent.entity.Student;
import com.greatlearning.studentfestevent.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.getById(id);
	}
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentRepository.saveAndFlush(student);
	}
	@Override
	public void deletById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}

}