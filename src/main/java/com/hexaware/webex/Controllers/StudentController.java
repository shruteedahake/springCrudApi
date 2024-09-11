package com.hexaware.webex.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.webex.Entity.Student;
import com.hexaware.webex.Service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	StudentService studSer;
	
	@PostMapping("/saveStudent")
	Student saveStudent( @RequestBody Student s) {
		Student s2=studSer.saveSt(s);
		return s2;
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents(){
		List<Student> users=studSer.getStuds();
		return users;
	}
	
	@DeleteMapping("removeStudent/{rollNo}")
	public Student removeStudent(@PathVariable int rollNo) {
		Student s=studSer.removeSd(rollNo);
		return s;
	}
	
	@PutMapping("updateName/{rollNo}/{name}")
	public String updateName(@PathVariable int rollNo, @PathVariable String name) {
		String s=studSer.updateSd(rollNo,name);
		return s;
	}
	
	@GetMapping("getByRollNo/{rollNo}")
	public int getByRollNo(@PathVariable int rollNo) {
		int s=studSer.getStudByRoll(rollNo);
		return s;
	}
	
}
