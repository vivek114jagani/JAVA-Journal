// Q3) class called Student. Store roll no. & name of the student. Define member functions to assign & display value of roll no. & name.

class Student {
    // Member variables
    private int rollNo;
    private String name;

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to assign roll number
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Method to assign name
    public void setName(String name) {
        this.name = name;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class Q3 {
    public static void main(String[] args) {
        // Create a student object
        Student student1 = new Student(101, "John Doe");

        // Display initial student details
        System.out.println("Initial Student Details:");
        student1.displayDetails();

        // Update student details
        student1.setRollNo(102);
        student1.setName("Jane Smith");

        // Display updated student details
        System.out.println("\nUpdated Student Details:");
        student1.displayDetails();
    }
}
