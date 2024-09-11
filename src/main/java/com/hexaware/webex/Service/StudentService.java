package com.hexaware.webex.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.webex.Dao.studentRepository;
import com.hexaware.webex.Entity.Student;

@Service
public class StudentService {
	
	@Autowired
	studentRepository repSt;
	
	public Student saveSt(Student s) {
		Student s2=repSt.save(s);
		return s2;
	}

	public List<Student> getStuds() {
		List<Student> l=(List<Student>) repSt.findAll();
		return l;
	}

	public Student removeSd(int rollNo) {
		Student s=repSt.findById(rollNo).orElse(null);
		if(s==null) {
			return null;
		}else {
			repSt.delete(s);
		}
		return s;
	}

	public String updateSd(int rollNo, String name) {
		Student s=repSt.findById(rollNo).orElse(null);
		if(s==null) {
			return "Not found";
		}else {
			s.setName(name);
			repSt.save(s);
			return "Updated!";
		}
	}

	public int getStudByRoll(int rollNo) {
		Student s=repSt.findById(rollNo).orElse(null);
		if(s==null) {
			return 0;
		}else {
			int roll=s.getRollNo();
			return roll;
		}
	}
}
