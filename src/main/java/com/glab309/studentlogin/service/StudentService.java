package com.glab309.studentlogin.service;

import com.glab309.studentlogin.dto.StudentDto;
import com.glab309.studentlogin.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDto studentDto);
    Student findStudentByEmail(String email);
    List<StudentDto> findAllStudents();
}

