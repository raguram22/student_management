package com.naga.studentmanagement.studentmanagement.service;

import com.naga.studentmanagement.studentmanagement.model.Student;
import com.naga.studentmanagement.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> findStudentById(long id) {
        return studentRepository.findById(id);
    }

    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }
}
