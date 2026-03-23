class Instructor extends User {
    String subject;

    Instructor(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    void display() {
        System.out.println("Instructor ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
