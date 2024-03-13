package com.example.studentservice.service;

import com.example.studentservice.model.Student;
import com.example.studentservice.model.ResponseWrapper;

import java.util.List;

public interface StudentService {
    ResponseWrapper<List<Student>> getAllStudents(Long adminId);

    ResponseWrapper<List<Student>> getAllStudents();



    List<Student> getData();

    ResponseWrapper<Student> getStudentById(Long studentId);

    ResponseWrapper<Student> createStudent(Long studentId, Student student);



    ResponseWrapper<Student> updateStudent(Long studentId, Student updatedStudent, String userRole);

    ResponseWrapper<Boolean> deleteStudent(Long studentId);

    ResponseWrapper<Boolean> deleteStudent(Long adminId, Long studentId);

    ResponseWrapper<List<Student>> updateStudent(Long studentId, Student updatedStudent);
}
