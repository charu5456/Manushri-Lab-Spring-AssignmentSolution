package com.greatlearning.studentfestevent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.studentfestevent.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
