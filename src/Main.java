import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        RegistrationManager manager = new RegistrationManager();
        Scanner sc = new Scanner(System.in);

        // Sample Instructor
        Instructor i1 = new Instructor(1, "Dr. Smith", "Java");

        // Sample Course
        Course c1 = new Course(101, "OOP", 2, i1);

        // Add course to system
        manager.addCourse(c1);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Enroll Student");
            System.out.println("3. View Students");
            System.out.println("4. View Courses");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                Student s = new Student(id, name);
                manager.addStudent(s);

                System.out.println("Student added");

            } else if (choice == 2) {
                if (manager.students.size() == 0) {
                    System.out.println("No students available");
                    continue;
                }

                Student s = manager.students.get(0); // simple selection
                manager.enrollStudent(s, c1);

            } else if (choice == 3) {
                manager.displayAllStudents();

            } else if (choice == 4) {
                manager.displayAllCourses();

            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
