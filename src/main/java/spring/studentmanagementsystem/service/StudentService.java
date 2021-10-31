package spring.studentmanagementsystem.service;

import java.util.List;

import spring.studentmanagementsystem.entity.Student;

public interface StudentService {
   List<Student> getAllStudents();

   Student saveStudent(Student student);

   Student getStudentById(Long id);

   Student updateStudent(Student student);

   void deleteStudent(Student student);
}
