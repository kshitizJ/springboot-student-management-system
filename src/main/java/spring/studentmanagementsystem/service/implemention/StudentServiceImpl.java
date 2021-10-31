package spring.studentmanagementsystem.service.implemention;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.studentmanagementsystem.entity.Student;
import spring.studentmanagementsystem.repository.StudentRepository;
import spring.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

   private StudentRepository studentRepository;

   public StudentServiceImpl(StudentRepository studentRepository) {
      this.studentRepository = studentRepository;
   }

   @Override
   public List<Student> getAllStudents() {
      return studentRepository.findAll();
   }

   @Override
   public Student saveStudent(Student student) {
      return studentRepository.save(student);
   }

   @Override
   public Student getStudentById(Long id) {
      return studentRepository.findById(id).get();
   }

   @Override
   public Student updateStudent(Student student) {
      return studentRepository.save(student);
   }

   @Override
   public void deleteStudent(Student student) {
      studentRepository.delete(student);
   }

}
