package com.example.studentservice.controller;

import com.example.studentservice.model.Student;
import com.example.studentservice.service.StudentService;
import com.example.studentservice.model.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{adminId}/students")
    public ResponseWrapper<List<Student>> getAllStudents(@PathVariable Long adminId) {
        return studentService.getAllStudents(adminId);
    }

    @PostMapping("/{adminId}/studentId/{studentId}")
    public ResponseEntity<ResponseWrapper<Student>> createStudent(
            @PathVariable Long adminId,

            @RequestBody Student student) {

        ResponseWrapper<Student> response = studentService.createStudent(adminId, student);

        if (response.isError()) {
            // Return an error response with appropriate status code
            return ResponseEntity.status(response.getStatusCode()).body(response);
        } else {
            // Return a success response with the created student and additional data
            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        }
    }

    @DeleteMapping("/{adminId}/studentId/{studentId}")
    public ResponseWrapper<Boolean> deleteStudent(
            @PathVariable Long adminId,
            @PathVariable Long studentId) {
        return studentService.deleteStudent(adminId, studentId);
    }


    @GetMapping("/{studentId}")
    public ResponseWrapper<Student> getStudentById(@PathVariable Long studentId) {
        return studentService.getStudentById(studentId);
    }

    @PutMapping("/{studentId}")
    public ResponseWrapper<List<Student>> updateStudent(
            @PathVariable Long studentId,
            @RequestBody Student updatedStudent) {
        return studentService.updateStudent(studentId, updatedStudent);

    }


}
