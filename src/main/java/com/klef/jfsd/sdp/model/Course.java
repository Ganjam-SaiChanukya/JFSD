package com.klef.jfsd.sdp.model;

import java.sql.Blob;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_table")
public class Course 
{
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
	  
	  @Column(unique = true,nullable = false)
	  private String coursecode;
	  
	  @Column(nullable = false)
	  private String coursetitle;
	  
	  @Column(nullable = false)
	  private String ltps;
	  
	  @Column(nullable = false)
	  private double credits;
	  
	  private Blob courseimage;

	public int getId() {
	  return id;
	}

	public void setId(int id) {
	  this.id = id;
	}

	public String getCoursecode() {
	  return coursecode;
	}

	public void setCoursecode(String coursecode) {
	  this.coursecode = coursecode;
	}

	public String getCoursetitle() {
	  return coursetitle;
	}

	public void setCoursetitle(String coursetitle) {
	  this.coursetitle = coursetitle;
	}

	public String getLtps() {
	  return ltps;
	}

	public void setLtps(String ltps) {
	  this.ltps = ltps;
	}

	public double getCredits() {
	  return credits;
	}

	public void setCredits(double credits) {
	  this.credits = credits;
	}

	public Blob getCourseimage() {
		return courseimage;
	}

	public void setCourseimage(Blob courseimage) {
		this.courseimage = courseimage;
	}

}

