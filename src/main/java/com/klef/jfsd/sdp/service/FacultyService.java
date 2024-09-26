package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;

public interface FacultyService 
{
	public String addfaculty(Faculty faculty);
	public String updatefaculty(Faculty faculty);
	public Faculty viewfacultybyid(int fid);
	
	public Faculty checkfacultylogin(String email,String pwd);
	public List<Course> ViewAllcourses();
}
