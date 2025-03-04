// StudentManager.java
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display!");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println("[" + i + "] " + students.get(i));
        }
    }

    // Search by PRN
    public void searchByPrn(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found!");
    }

    // Search by name
    public void searchByName(String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student found: " + student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student with name " + name + " not found!");
        }
    }

    // Search by position
    public void searchByPosition(int position) {
        if (position >= 0 && position < students.size()) {
            System.out.println("Student at position " + position + ": " + students.get(position));
        } else {
            System.out.println("Invalid position!");
        }
    }

    // Update student
    public void updateStudent(String prn, Student newDetails) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getPrn().equals(prn)) {
                students.set(i, newDetails);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found!");
    }

    // Delete student
    public void deleteStudent(String prn) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getPrn().equals(prn)) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found!");
    }
}