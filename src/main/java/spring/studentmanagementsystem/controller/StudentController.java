package spring.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import spring.studentmanagementsystem.entity.Student;
import spring.studentmanagementsystem.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * StudentController
 */
@Controller
public class StudentController {
   private StudentService studentService;

   public StudentController(StudentService studentService) {
      this.studentService = studentService;
   }

   // handler method to handle list of students and return model and view
   @GetMapping("/students")
   public String listStudents(Model model) {
      model.addAttribute("students", studentService.getAllStudents());
      return "students";
   }

   @GetMapping("/student/new")
   public String createStudentForm(Model model) {
      Student student = new Student();
      model.addAttribute("student", student);
      return "create_student";
   }

   @PostMapping(value = "/student")
   public String saveStudent(@ModelAttribute("student") Student student) {
      studentService.saveStudent(student);
      return "redirect:/students";
   }

   @GetMapping("/student/update/{id}")
   public String updateStudent(@PathVariable Long id, Model model) {
      model.addAttribute("student", studentService.getStudentById(id));
      return "update_student";
   }

   @PostMapping("/student/update/{id}")
   public String saveUpdatedStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
      Student existingStudent = studentService.getStudentById(id);
      existingStudent.setId(student.getId());
      existingStudent.setFirstName(student.getFirstName());
      existingStudent.setLastName(student.getLastName());
      existingStudent.setEmail(student.getEmail());
      existingStudent.setRollNo(student.getRollNo());
      studentService.updateStudent(existingStudent);
      return "redirect:/students";
   }

   @GetMapping("/student/delete/{id}")
   public String deleteStudent(@PathVariable Long id) {
      Student existingStudent = studentService.getStudentById(id);
      studentService.deleteStudent(existingStudent);
      return "redirect:/students";
   }
}