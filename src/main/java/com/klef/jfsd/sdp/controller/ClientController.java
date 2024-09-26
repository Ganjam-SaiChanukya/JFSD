package com.klef.jfsd.sdp.controller;

import java.io.IOException;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Faculty;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.service.AdminService;
import com.klef.jfsd.sdp.service.FacultyService;
import com.klef.jfsd.sdp.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ClientController 
{
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private FacultyService facultyService;
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/")
	public String main()
	{
		return "index";
	}
	
	 @GetMapping("adminlogin") //URI & method name can be different
	  public ModelAndView adminlogin() 
	  {
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("adminlogin");
	  return mv;
	  }
	
	  @GetMapping("facultylogin")
	  public ModelAndView facultylogin()
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("facultylogin");
	    return mv;
	  }

	  
	  @GetMapping("studentlogin")
	  public ModelAndView studentlogin()
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("studentlogin");
	    return mv;
	  }
	  
	  @GetMapping("facultyreg")
	  public ModelAndView facultyregistration()
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("facultyreg");
	    return mv;
	  }
	  
	  @GetMapping("studentreg")
	  public ModelAndView studentregistration()
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("studentreg");
	    return mv;
	  }
	  
	  @PostMapping("insertfaculty")
	  public ModelAndView insertfaculty(HttpServletRequest request)
	  {
	    String msg=null;
	    ModelAndView mv=new ModelAndView();
	    try {
	        String name = request.getParameter("name");
	        String gender = request.getParameter("gender");
	        String dob = request.getParameter("dob");
	        String dept = request.getParameter("dept");
	        String sal = request.getParameter("salary");
	        double salary = Double.parseDouble(sal);
	        String email = request.getParameter("email");
	        String pwd = request.getParameter("pwd");
	        String location = request.getParameter("location");
	        String contact = request.getParameter("contact");
	        
	        Faculty faculty=new Faculty();
	        
	        faculty.setName(name);
	        faculty.setGender(gender);
	        faculty.setDateofbirth(dob);
	        faculty.setDepartment(dept);
	        faculty.setSalary(salary);
	        faculty.setEmail(email);
	        faculty.setPassword(pwd);
	        faculty.setLocation(location);
	        faculty.setContact(contact);
	          
	          msg=facultyService.addfaculty(faculty);
	          mv.setViewName("facultydisplaymsg");
	        mv.addObject("message",msg);
	    }
	    catch(Exception e)
	    {
	      msg=e.getMessage();
	    }
	    mv.setViewName("facultydisplayerror");
	    mv.addObject("message",msg);
	    
	    return mv; 
	  }
	  
	  @PostMapping("insertstudent")
	  public ModelAndView insertstudent(HttpServletRequest request)
	  {
	    String msg=null;
	    ModelAndView mv=new ModelAndView();
	    try {
	        String name = request.getParameter("name");
	        String gender = request.getParameter("gender");
	        String dob = request.getParameter("dob");
	        String dept = request.getParameter("dept");
	        String email = request.getParameter("email");
	        String pwd = request.getParameter("pwd");
	        String location = request.getParameter("location");
	        String contact = request.getParameter("contact");
	        
	        Student student=new Student();
	        
	        student.setName(name);
	        student.setGender(gender);
	        student.setDateofbirth(dob);
	        student.setDepartment(dept);
	        student.setEmail(email);
	        student.setPassword(pwd);
	        student.setLocation(location);
	        student.setContact(contact);
	          
	          msg=studentService.addstudent(student);
	          mv.setViewName("studentdisplaymsg");
	        mv.addObject("message",msg);
	    }
	    catch(Exception e)
	    {
	      msg=e.getMessage();
	    }
	    mv.setViewName("studentdisplayerror");
	    mv.addObject("message",msg);
	    
	    return mv; 
	  }
	  
	  
	  @PostMapping("checkadminlogin")
	  public ModelAndView checkadminlogin(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView(); 
	    
	    
	    String uname = request.getParameter("uname");
	     String pwd = request.getParameter("pwd");
	     
	    Admin admin = adminService.checkadminlogin(uname, pwd);
	    
	    if(admin!=null)
	    {
	      mv.setViewName("adminhome");
	    }
	    else
	    {
	      mv.setViewName("adminlogin");
	      mv.addObject("message", "Login Failed");
	    }
	    
	    return mv;
	  }
	  
	  
	  @PostMapping("checkfacultylogin")
	  public ModelAndView checkfacultylogin(HttpServletRequest request)
	  {
	    ModelAndView mv=new ModelAndView();
	    String email = request.getParameter("email");
	       String pwd = request.getParameter("pwd");
	       
	      Faculty faculty =  facultyService.checkfacultylogin(email, pwd);
	      
	      if(faculty!=null)
	      {
	    	  //session
	    	  
	    	  HttpSession session =request.getSession();
	    	  
	    	  session.setAttribute("fid",faculty.getId()); //fid is a session variable
	    	  session.setAttribute("fname",faculty.getName()); //fname is a session variable
	    	  //session
	        mv.setViewName("facultyhome");
	      }
	      else
	      {
	        mv.setViewName("facultylogin");
	        mv.addObject("message","Login Failed");
	      }
	      return mv;
	  }
	  
	  @PostMapping("checkstudentlogin")
	  public ModelAndView checkstudentlogin(HttpServletRequest request)
	  {
	    ModelAndView mv=new ModelAndView();
	    String email = request.getParameter("email");
	       String pwd = request.getParameter("pwd");
	       
	      Student student =  studentService.checkstudentlogin(email, pwd);
	      
	      if(student!=null)
	      {
	    	  //session
	    	  
	    	  HttpSession session =request.getSession();
	    	  
	    	  session.setAttribute("sid",student.getId()); //sid is a session variable
	    	  session.setAttribute("sname",student.getName()); //sname is a session variable
	    	  //session
	        mv.setViewName("studenthome");
	      }
	      else
	      {
	        mv.setViewName("studentlogin");
	        mv.addObject("message","Login Failed");
	      }
	      return mv;
	  }
	  
	  
	  @GetMapping("viewallfaculties")
	  public ModelAndView viewallfaculties()
	  {
	    List<Faculty>facultylist=adminService.viewallfaculties();
	    ModelAndView mv=new ModelAndView("viewallfaculties");
	    mv.addObject("facultydata",facultylist);
	    return mv;
	  }
	  
	  @GetMapping("viewfaculty")
	  public ModelAndView viewempdemo(@RequestParam("id") int fid)
	  {
	    Faculty faculty = adminService.viewfacultybyid(fid);
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("viewfacultybyid");
	    mv.addObject("faculty", faculty);
	    return mv;
	  }
	  
	  
	  @GetMapping("viewallstudents")
	  public ModelAndView viewallstudents()
	  {
	    List<Student>studentlist=adminService.viewallstudents();
	    ModelAndView mv=new ModelAndView("viewallstudents");
	    mv.addObject("studentdata",studentlist);
	    return mv;
	  }
	  
	  
	  @GetMapping("viewstudent")
	  public ModelAndView viewstudentdemo(@RequestParam("id") int sid)
	  {
	    Student student = adminService.viewstudentbyid(sid);
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("viewstudentbyid");
	    mv.addObject("student", student);
	    return mv;
	  }
	  
	  @GetMapping("adminhome")
	  public ModelAndView adminhome	(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("adminhome");
	    return mv;
	  }
	  
	  @GetMapping("facultyhome")
	  public ModelAndView fachome(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("facultyhome");
	    return mv;
	  }
	  
	  @GetMapping("studenthome")
	  public ModelAndView stdhome(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("studenthome");
	    return mv;
	  }
	  
	  @GetMapping("deletefac/{id}")
	  public String deleteactionf(@PathVariable("id") int fid)
	  {
	    adminService.deletefaculty(fid);
	    return "redirect:/deletefaculty";
	  }	
	  
	  @GetMapping("deletefaculty")
	  public ModelAndView deletefacultydemo()
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("deletefaculty"); //deletefaculty is jsp file name
	    List<Faculty> faclist =  adminService.viewallfaculties();
	    mv.addObject("facdata", faclist);
	    return mv;
	  }
	  
	  @GetMapping("deletestu/{id}")
	  public String deleteactions(@PathVariable("id") int sid)
	  {
	    adminService.deletestudent(sid);
	    return "redirect:/deletestudent";
	  }	
	  
	  @GetMapping("deletestudent")
	  public ModelAndView deletestudentdemo()
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("deletestudent"); //deletestudent is jsp file name
	    List<Student> stdlist =  adminService.viewallstudents();
	    mv.addObject("stddata", stdlist);
	    return mv;
	  }
	  
	  
	  @GetMapping("updatefacultyprofile")
	  public ModelAndView updatefaculty(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView();
	    
	    HttpSession session = request.getSession();
	    
	    mv.setViewName("updatefacultyprofile");
	    
	    mv.addObject("fid", session.getAttribute("fid"));
	    mv.addObject("fname", session.getAttribute("fname"));
	    
	    int id = (int) session.getAttribute("fid");
	    
	    Faculty faculty = facultyService.viewfacultybyid(id);
	    
	    mv.addObject("faculty", faculty);
	    
	    return mv;
	  }
	  
	  @PostMapping("updatefaculty")
	  public ModelAndView updatefacultyaction(HttpServletRequest request)
	  {
	    String msg = null;
	    
	    ModelAndView mv = new ModelAndView();
	    
	      HttpSession session = request.getSession();
	    
	    mv.addObject("fid", session.getAttribute("fid"));
	    mv.addObject("fname", session.getAttribute("fname"));
	    
	    int id = (int) session.getAttribute("fid");
	    
	   try
	   {
	     String name = request.getParameter("name");
	     String dob = request.getParameter("dob");
	     String dept = request.getParameter("dept");
	     String sal = request.getParameter("salary");
	     double salary = Double.parseDouble(sal);
	     String email = request.getParameter("email");
	     String pwd = request.getParameter("pwd");
	     String location = request.getParameter("location");
	     String contact = request.getParameter("contact");
	     
	     Faculty faculty = new Faculty();
	     faculty.setId(id);
	     faculty.setName(name);
	     faculty.setDateofbirth(dob);
	     faculty.setDepartment(dept);
	     faculty.setSalary(salary);
	     faculty.setEmail(email);
	     faculty.setPassword(pwd);
	     faculty.setLocation(location);
	     faculty.setContact(contact);
	      
	      
	      msg = facultyService.updatefaculty(faculty);
	      
	      mv.setViewName("facultylogin");
	      mv.addObject("message",msg);
	     
	   }
	   catch(Exception e)
	   {
	     msg = e.getMessage();
	     
	     mv.setViewName("updatefacultyerror");
	      mv.addObject("message",msg);
	   }
	    
	   
	    return mv;

	  }
	  
	  @GetMapping("updatestudentprofile")
	  public ModelAndView updatestudent(HttpServletRequest request)
	  {
	    ModelAndView mv = new ModelAndView();
	    
	    HttpSession session = request.getSession();
	    
	    mv.setViewName("updatestudentprofile");
	    
	    mv.addObject("sid", session.getAttribute("sid"));
	    mv.addObject("sname", session.getAttribute("sname"));
	    
	    int id = (int) session.getAttribute("sid");
	    
	    Student student = studentService.viewstudentbyid(id);
	    
	    mv.addObject("student", student);
	    
	    return mv;
	  }
	  
	  @PostMapping("updatestudent")
	  public ModelAndView updatestudentaction(HttpServletRequest request)
	  {
	    String msg = null;
	    
	    ModelAndView mv = new ModelAndView();
	    
	      HttpSession session = request.getSession();
	    
	    mv.addObject("sid", session.getAttribute("sid"));
	    mv.addObject("sname", session.getAttribute("sname"));
	    
	    int id = (int) session.getAttribute("sid");
	    
	   try
	   {
	     String name = request.getParameter("name");
	     String dob = request.getParameter("dob");
	     String dept = request.getParameter("dept");
	     String email = request.getParameter("email");
	     String pwd = request.getParameter("pwd");
	     String location = request.getParameter("location");
	     String contact = request.getParameter("contact");
	     
	     Student student = new Student();
	     student.setId(id);
	     student.setName(name);
	     student.setDateofbirth(dob);
	     student.setDepartment(dept);
	     student.setEmail(email);
	     student.setPassword(pwd);
	     student.setLocation(location);
	     student.setContact(contact);
	      
	      
	      msg = studentService.updatestudent(student);
	      
	      mv.setViewName("studentlogin");
	      mv.addObject("message",msg);
	     
	   }
	   catch(Exception e)
	   {
	     msg = e.getMessage();
	     
	     mv.setViewName("updatestudenterror");
	      mv.addObject("message",msg);
	   }
	    
	   
	    return mv;

	  }
	  
	  @GetMapping("addcourse")
	   public ModelAndView addCoursetdemo()
	   {
		   ModelAndView mv = new ModelAndView("addcourse");
		   return mv;
	   }
	  
	  @PostMapping("insertcourse")
	   public ModelAndView insertCoursedemo(HttpServletRequest request,@RequestParam("courseimage") MultipartFile file) throws IOException, SerialException, SQLException
	   {
		   String msg = null;
		   
		   ModelAndView mv = new ModelAndView();
		   
		   try
		   {
		   String coursecode = request.getParameter("coursecode");
		   String coursetitle = request.getParameter("coursetitle");
		   String ltps = request.getParameter("ltps");
		   Double credits = Double.valueOf(request.getParameter("credits"));

		   
			  byte[] bytes = file.getBytes();
			  Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
			  
			  Course course = new Course();
			  course.setCoursecode(coursecode);
			  course.setCoursetitle(coursetitle);
			  course.setLtps(ltps);
			  course.setCredits(credits);
			  course.setCourseimage(blob);
			  
			  msg=adminService.AddCourse(course);
			  System.out.println(msg);
			  mv.setViewName("coursemsg");
			  mv.addObject("message",msg);
		   }	  
		   catch(Exception e)
		   {
			   msg = e.getMessage();
			   System.out.println(msg.toString());
			   mv.setViewName("courseerror");
			   mv.addObject("message",msg);
		   }
		   return mv;
	   }
	   
	   @GetMapping("Coursesubmission")
	   public ModelAndView CoursesubmissionCoursetdemo()
	   {
		   ModelAndView mv = new ModelAndView("Coursesubmission");
		   return mv;
	   }

	   @GetMapping("viewallcourses")
	   public ModelAndView viewallcourses()
	   {
           List<Course> courseList = facultyService.ViewAllcourses();
		   
		   ModelAndView mv = new ModelAndView("viewallcourses");
		   
		   mv.addObject("courseList", courseList);
		   
		   return mv;
	   }
	   
	   @GetMapping("marking")
	   public ModelAndView marking()
	   {
		   ModelAndView mv = new ModelAndView("marking");
		   return mv;
	   }
	   
	   @GetMapping("studentviewallcourses")
	   public ModelAndView studentviewallcourses()
	   {
           List<Course> courseList = studentService.ViewAllCousres();
		   
		   ModelAndView mv = new ModelAndView("studentviewallcourses");
		   
		   mv.addObject("courseList", courseList);
		   
		   return mv;
	   }
}
