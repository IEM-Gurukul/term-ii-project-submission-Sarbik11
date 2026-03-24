class Course {
    int courseId;
    String courseName;
    int capacity;
    int enrolledCount;
    Instructor instructor;

    Course(int courseId, String courseName, int capacity, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledCount = 0;
        this.instructor = instructor;
    }

    boolean enrollStudent() {
        if (enrolledCount < capacity) {
            enrolledCount++;
            return true;
        } else {
            return false;
        }
    }

    void displayCourse() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Enrolled: " + enrolledCount);
    }
}
