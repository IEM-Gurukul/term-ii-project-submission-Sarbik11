[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
University Course Registration System
---

## Problem Statement (max 150 words)
Manually handling course registrations at a university may cause many problems, including errors and inefficient handling of data. In this project, a console-based application is to be developed that would enable students to register for their courses while satisfying certain conditions like the number of seats available for a particular course. Such a system would simulate real-life interactions between students and teachers by incorporating the principles of object-oriented programming.
---

## Target User
- Students
- Academic administrators
---

## Core Features
- Add student records
- Create and manage courses
- Assign instructors to courses
- Enroll students with capacity check
- View student and course details
- 
- 
- 

---

## OOP Concepts Used

- Abstraction:The structure of the base class 'User' has been defined.
- Inheritance:The classes 'Student' and 'Instructor' are derived from 'User'.
- Polymorphism: The method 'display()' has been overridden.
- Exception Handling:Basic input validation has been performed.
- Collections / Threads:'ArrayList' has been used for data storage.

---

## Proposed Architecture Description
The system follows a modular object-oriented architecture. The `User` class acts as a base class, extended by `Student` and `Instructor`. The `Course` class manages course-related data including capacity and instructor assignment. The `Enrollment` class represents the relationship between students and courses. The `RegistrationManager` class acts as the core controller, handling all operations such as adding users and managing enrollments. The `Main` class provides a menu-driven interface for user interaction.
---

## How to Run
1. Navigate to the src folder:
   cd src

2. Compile all files:
   javac *.java

3. Run the program:
   java Main
---

## Git Discipline Notes
- Development was done incrementally across multiple commits
- Each class was implemented step-by-step
- Proper commit messages were maintained to reflect progress
