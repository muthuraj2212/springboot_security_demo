package com.example.basiccurd.Controller;

import com.example.basiccurd.Model.Student;
import com.example.basiccurd.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {
    @Autowired
    studentService studentService;
    @GetMapping("/public")
    public  String welcomePage(){
        return " WELCOME TO *** INSTITUTE";
    }

    @GetMapping("/student")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentById(id);
    }
    @PostMapping("/staff")
    public String addStudent(@RequestBody Student student){
        return  studentService.addStudent(student);
    }
    @PutMapping("/staff/{id}")
    public String updateStudent(@RequestBody Student student, @PathVariable Long id){
        return  studentService.updateStudent(student,id);
    }
    @DeleteMapping("/staff/{id}")
    public String deleteStudentById(@PathVariable Long id){
        return studentService.deleteStudentById(id);
    }
    @DeleteMapping("/staff")
    public String deleteAllStudents(){
        return studentService.deleteAllStudents();
    }

}
