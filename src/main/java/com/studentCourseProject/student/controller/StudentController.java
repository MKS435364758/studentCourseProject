package com.studentCourseProject.student.controller;


import com.studentCourseProject.student.model.Student;
import com.studentCourseProject.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("all-students-info")
    public ResponseEntity<List> getAll(){
        return new ResponseEntity<>(studentService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Student> getByName(@PathVariable("name") String name){
        return new ResponseEntity<>(studentService.getByName(name), HttpStatus.OK);
    }

    @GetMapping("/{year}")
    public ResponseEntity<Student> getByName(@PathVariable("year") int year){
        return new ResponseEntity<>(studentService.getByYear(year), HttpStatus.OK);
    }

    @PostMapping("addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("updateStudent")
    public void updateStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping("deleteStudent/id-{id}")
    public void deleteStudentById(@PathVariable("id") int id){
        studentService.deleteStudentById(id);
    }

}
