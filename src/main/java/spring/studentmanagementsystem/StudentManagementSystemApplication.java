package spring.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.studentmanagementsystem.entity.Student;
import spring.studentmanagementsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

   public static void main(String[] args) {
      SpringApplication.run(StudentManagementSystemApplication.class, args);
   }

   @Autowired
   private StudentRepository studentRepository;

   @Override
   public void run(String... args) throws Exception {
      Student student1 = new Student("Kshitiz", "Jain", "kshitiz.jain@mail.com", 25);
      studentRepository.save(student1);

      Student student2 = new Student("Omkar", "Chougule", "omkar.chougule@mail.com", 5);
      studentRepository.save(student2);

      Student student3 = new Student("Jyoti", "Dutta", "jyoti.dutta@mail.com", 9);
      studentRepository.save(student3);
   }

}
