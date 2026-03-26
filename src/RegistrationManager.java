import java.util.ArrayList;

class RegistrationManager {
    ArrayList<Student> students;
    ArrayList<Course> courses;
    ArrayList<Enrollment> enrollments;

    RegistrationManager() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
        enrollments = new ArrayList<>();
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void addCourse(Course c) {
        courses.add(c);
    }

    void enrollStudent(Student s, Course c) {
        if (c.enrollStudent()) {
            Enrollment e = new Enrollment(s, c);
            enrollments.add(e);
            s.registerCourse(c.courseName);
            System.out.println("Enrollment successful");
        } else {
            System.out.println("Course is full");
        }
    }

    void displayAllStudents() {
        for (Student s : students) {
            s.display();
            System.out.println("----------------");
        }
    }

    void displayAllCourses() {
        for (Course c : courses) {
            c.displayCourse();
            System.out.println("----------------");
        }
    }
}
