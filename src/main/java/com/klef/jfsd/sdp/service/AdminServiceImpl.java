package com.klef.jfsd.sdp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.repository.AdminRepository;
import com.klef.jfsd.sdp.repository.CourseRepository;
import com.klef.jfsd.sdp.repository.FacultyRepository;
import com.klef.jfsd.sdp.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private FacultyRepository facultyRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	

	@Override
	public List<Faculty> viewallfaculties() {
		return facultyRepository.findAll();
	}

	@Override
	public List<Student> viewallstudents() {
		return studentRepository.findAll();
	}

	@Override
	public String deletefaculty(int fid) 
	{

		Optional<Faculty> obj = facultyRepository.findById(fid);
	    
	    String msg = null;
	    
	    if(obj.isPresent())
	    {
	      Faculty faculty = obj.get();
	      facultyRepository.delete(faculty);
	      msg = "Faculty Deleted Successfully";
	    }
	    else
	    {
	      msg = "Faculty Not Found";
	    }
	    
	    return msg;
	
	}

	@Override
	public String deletestudent(int sid) 
	{
		Optional<Student> obj = studentRepository.findById(sid);
	    
	    String msg = null;
	    
	    if(obj.isPresent())
	    {
	      Student student = obj.get();
	      studentRepository.delete(student);
	      msg = "Student Deleted Successfully";
	    }
	    else
	    {
	      msg = "Student Not Found";
	    }
	    
	    return msg;
	}

	@Override
	public Admin checkadminlogin(String auname, String apwd) {
		return adminRepository.checkadminlogin(auname, apwd);
	}

	@Override
	public Faculty viewfacultybyid(int fid) 
	{
       Optional<Faculty> obj = facultyRepository.findById(fid);    
	    
	    if(obj.isPresent())
	    {
	      Faculty faculty = obj.get();
	      return faculty;
	    }
	    else
	    {
	      return null;
	    }
	}

	@Override
	public Student viewstudentbyid(int sid) 
	{
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
	public String AddCourse(Course course) {
		courseRepository.save(course);
		return "Course Added Successfully";
	}

}
