package com.example.basiccurd.Service;

import com.example.basiccurd.Model.Student;

import com.example.basiccurd.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
    @Autowired
    StudentRepo studentRepo;


    public List<Student> getAllStudents() {
       return studentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElseThrow(()->new RuntimeException("student not found"));
    }

    public String addStudent(Student student) {
        student.setPassword(passwordEncoder.encode(student.getPassword()));
        studentRepo.save(student);
        return "student added";
    }

    public String updateStudent(Student student, Long id) {
     Student  existingStudent=studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student not found"));
     existingStudent.setUserName(student.getUserName());
     existingStudent.setEmail(student.getEmail());
     existingStudent.setPassword(student.getPassword());
     existingStudent.setDepartment(student.getDepartment());
     studentRepo.save(existingStudent);
     return "updated successfully";
    }

    public String deleteStudentById(Long id) {
        studentRepo.deleteById(id);
        return "student deleted";
    }

    public String deleteAllStudents() {
        studentRepo.deleteAll();
        return "cleared all students";
    }
}
