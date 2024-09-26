	package com.klef.jfsd.sdp.service;
	
	import java.util.List;
	
	import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;
	import com.klef.jfsd.sdp.model.Student;
	
	public interface AdminService 
	{
		public List<Faculty> viewallfaculties();
		public List<Student> viewallstudents();
		public String deletefaculty(int fid);
		public String deletestudent(int sid);
		public Faculty viewfacultybyid(int fid);
		public Student viewstudentbyid(int sid);
		public Admin checkadminlogin(String auname,String apwd);
		public String AddCourse(Course course);
	}
