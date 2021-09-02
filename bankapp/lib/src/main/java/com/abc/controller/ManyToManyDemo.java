package com.abc.controller;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abc.entity.Course;
import com.abc.entity.Student;

public class ManyToManyDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = emf.createEntityManager();
		
		Student student1 = new Student();
		student1.setStudentId(1000);
		student1.setStudentName("aaa");
		student1.setEmail("aaa@tmail.com");
		
		Student student2 = new Student();
		student2.setStudentId(2000);
		student2.setStudentName("bbb");
		student2.setEmail("bbb@tmail.com");
		
		Student student3 = new Student();
		student3.setStudentId(3000);
		student3.setStudentName("ccc");
		student3.setEmail("ccc@tmail.com");
		
		Student student4 = new Student();
		student4.setStudentId(4000);
		student4.setStudentName("ddd");
		student4.setEmail("ddd@tmail.com");
		
		Course course1 = new Course();
		course1.setCourseId(11);
		course1.setCourseName("java");
		course1.setDuration(45);
		course1.setFees(5000);
		
		Course course2 = new Course();
		course2.setCourseId(22);
		course2.setCourseName("devops");
		course2.setDuration(25);
		course2.setFees(6000);
		
		
		Course course3 = new Course();
		course3.setCourseId(33);
		course3.setCourseName("jpa");
		course3.setDuration(25);
		course3.setFees(6000);
		
		
		Course course4 = new Course();
		course4.setCourseId(44);
		course4.setCourseName("spring");
		course4.setDuration(25);
		course4.setFees(6000);
		
		Set<Course> courseList = new HashSet<>();
		courseList.add(course4);
		courseList.add(course1);
		
		Set<Student> studentList = new HashSet<>();
		studentList.add(student1);
		
		course1.setStudents(studentList);
		course4.setStudents(studentList);
		
		student1.setCourses(courseList);
		
		em.getTransaction().begin();
		
		em.persist(student1);

		em.getTransaction().commit();
		
		System.out.println("saved.");
	
		em.close();
		emf.close();	

	}

}
