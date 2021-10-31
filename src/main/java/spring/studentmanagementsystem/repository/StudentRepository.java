package spring.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
   
}
