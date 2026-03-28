import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        RegistrationManager manager = new RegistrationManager();
        Scanner sc = new Scanner(System.in);

      
        Instructor i1 = new Instructor(1, "Dr. Smith", "Java");

        
        Course c1 = new Course(101, "OOP", 2, i1);

      
        manager.addCourse(c1);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Enroll Student");
            System.out.println("3. View Students");
            System.out.println("4. View Courses");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice;

          
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Enter a number.");
                sc.nextLine();
                continue;
            }

            if (choice == 1) {

                int id;

                System.out.print("Enter ID: ");

                // 🔥 Input validation for ID
                try {
                    id = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid ID! Please enter numbers only.");
                    sc.nextLine();
                    continue;
                }

                sc.nextLine(); // clear buffer

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                Student s = new Student(id, name);
                manager.addStudent(s);

                System.out.println("Student added successfully");

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
