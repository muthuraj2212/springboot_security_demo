package com.example.basiccurd.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "user_name")
    private String userName;

    @NotBlank(message = "Email is mandatory")
    @Column(name = "email")
    private String Email;

    @NotBlank(message = "Password is mandatory")
    @Column(name = "password")
    private String Password;

    @NotBlank(message = "Department is mandatory")
    @Column(name = "department")
    private String Department;
    @Column(name = "role")
    @NotBlank(message = "role is mandatory")
    private String Role;
}

