package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Student;

public interface StudentService 
{
	public String addstudent(Student student);
	public String updatestudent(Student student);
	public Student viewstudentbyid(int sid);
	public Student checkstudentlogin(String email,String pwd);
	public List<Course> ViewAllCousres();
}
