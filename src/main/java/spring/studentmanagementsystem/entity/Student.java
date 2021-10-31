package spring.studentmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "first_name", nullable = false, length = 20)
   private String firstName;

   @Column(name = "last_name", length = 20)
   private String lastName;

   @Column(name = "email", nullable = false, unique = true, length = 50)
   private String email;

   private Integer rollNo;

   public Student() {
   }

   public Student(String firstName, String lastName, String email, Integer rollNo) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.rollNo = rollNo;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Integer getRollNo() {
      return rollNo;
   }

   public void setRollNo(Integer rollNo) {
      this.rollNo = rollNo;
   }

   @Override
   public String toString() {
      return "Student [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo
            + "]";
   }

}
