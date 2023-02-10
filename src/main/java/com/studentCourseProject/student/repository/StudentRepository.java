package com.studentCourseProject.student.repository;

import com.studentCourseProject.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    public Student findStudentByName(String name);

    public Student findStudentByYear(int year);

}
