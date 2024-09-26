package com.klef.jfsd.sdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.sdp.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>
{

}
