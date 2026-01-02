package com.example.basiccurd.Repository;

import com.example.basiccurd.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    Student findByUserName(String userName);
}

