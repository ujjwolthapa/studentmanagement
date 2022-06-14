package com.example.studentmanagement;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("bromx","thapa","bromx@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("ujjwol","thapa","ujjwolthapa@gmail.com");
//		studentRepository.save(student2);


	}
}
