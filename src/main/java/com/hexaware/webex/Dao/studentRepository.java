package com.hexaware.webex.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.webex.Entity.Student;

@Repository
public interface studentRepository extends CrudRepository<Student, Integer>{

}
