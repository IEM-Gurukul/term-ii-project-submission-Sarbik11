class Student extends User {
    String courseRegistered;

    Student(int id, String name) {
        super(id, name);
        courseRegistered = "";
    }

    void registerCourse(String courseName) {
        courseRegistered = courseName;
    }

    void dropCourse() {
        courseRegistered = "";
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + courseRegistered);
    }
}
