package com.klef.jfsd.sdp.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.repository.CourseRepository;
import com.klef.jfsd.sdp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	

	
	@Override
	public String addstudent(Student student) {
		studentRepository.save(student);
		return "Student Added Successfully";
	}

	@Override
	public String updatestudent(Student student) {
		 Student s = studentRepository.findById(student.getId()).get();    
		    
	      s.setName(student.getName());
	      s.setDateofbirth(student.getDateofbirth());
	      s.setDepartment(student.getDepartment());
	      s.setEmail(student.getEmail());
	      s.setPassword(student.getPassword());
	      s.setLocation(student.getLocation());
	      s.setContact(student.getContact());
	    
	    studentRepository.save(s);
	    
	    return "Student Updated Successfully";
	}

	@Override
	public Student checkstudentlogin(String email, String pwd) {
		return studentRepository.checkstudentlogin(email, pwd);
	}

	@Override
	public Student viewstudentbyid(int sid) {
		Optional<Student> obj = studentRepository.findById(sid);    
	      
	      if(obj.isPresent())
	      {
	        Student student = obj.get();
	        return student;
	      }
	      else
	      {
	        return null;
	      }
	}

	@Override
	public List<Course> ViewAllCousres() {
		return (List<Course>) courseRepository.findAll();
	}

}
