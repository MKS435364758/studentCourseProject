package com.studentCourseProject.student.service;


import com.studentCourseProject.student.model.Student;
import com.studentCourseProject.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public List<Student> getAll(){
        return repo.findAll();
    }

//    public Student getById(int id){
//        return repo.findById(id);
//    }

    public Student getByName(String name){
        return (Student) repo.findStudentByName(name);
    }

    public Student getByYear(int year){
        return (Student) repo.findStudentByYear(year);
    }

    public void addStudent(Student student){
        repo.save(student);
    }

    public void deleteStudentById(int id){
        repo.deleteById(id);
    }

}
