class Enrollment {
    Student student;
    Course course;

    Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    void displayEnrollment() {
        System.out.println("Student: " + student.name);
        System.out.println("Course: " + course.courseName);
    }
}
