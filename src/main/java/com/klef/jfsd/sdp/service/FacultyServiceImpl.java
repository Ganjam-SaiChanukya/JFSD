package com.klef.jfsd.sdp.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.repository.CourseRepository;
import com.klef.jfsd.sdp.repository.FacultyRepository;

@Service
public class FacultyServiceImpl implements FacultyService
{
	@Autowired
	private FacultyRepository facultyRepository;
	
	@Autowired
	private CourseRepository projectRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	

	@Override
	public String addfaculty(Faculty faculty) 
	{
		facultyRepository.save(faculty);
		return "Faculty Added Successfully";
	}

	@Override
	public String updatefaculty(Faculty faculty) {
		 Faculty f = facultyRepository.findById(faculty.getId()).get();    
		    
	      f.setName(faculty.getName());
	      f.setDateofbirth(faculty.getDateofbirth());
	      f.setDepartment(faculty.getDepartment());
	      f.setSalary(faculty.getSalary());
	      f.setEmail(faculty.getEmail());
	      f.setPassword(faculty.getPassword());
	      f.setLocation(faculty.getLocation());
	      f.setContact(faculty.getContact());
	    
	    facultyRepository.save(f);
	    
	    return "Faculty Updated Successfully";
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
	public Faculty checkfacultylogin(String email, String pwd) {
		return facultyRepository.checkfacultylogin(email, pwd);
	}

	@Override
	public List<Course> ViewAllcourses() {
		return (List<Course>) courseRepository.findAll();
	}

	
	
}
