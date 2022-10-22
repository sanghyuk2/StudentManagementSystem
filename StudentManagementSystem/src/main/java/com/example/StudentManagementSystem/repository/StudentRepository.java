package com.example.StudentManagementSystem.repository;

import com.example.StudentManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository 필요없다. 왜냐하면 JpaRepository를 상속하는 SimpleJpaRepository가 이미 가지고 있기 때문이다.
public interface StudentRepository extends JpaRepository<Student, Long> {

}
