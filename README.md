# Spring Boot Security Demo

This is a **demo project** built with **Spring Boot** (Java 21) to manage students.  
It demonstrates **CRUD operations**, **Spring Security authentication**, and **role-based authorization**.

---

## Features

- Create, Read, Update, Delete (CRUD) operations for Student entity  
- Password hashing using **BCrypt**  
- Role-based authorization: **STAFF** and **STUDENT**  
- RESTful API endpoints  
- Global exception handling for invalid requests  
- **Swagger not used in this version**  

---

## Technologies Used

- **Java 21**  
- Spring Boot  
- Spring Security  
- Spring Data JPA  
- MySQL (or H2 for testing)  
- Maven  

---

## User Roles

- **STAFF**: Can add, update, delete students  
- **STUDENT**: Can view students only  

---

## How to Run

1. Clone the repository:
```bash
git clone https://github.com/muthuraj2212/springboot_security_demo.git