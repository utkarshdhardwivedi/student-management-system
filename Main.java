// Main.java
import java.util.Scanner;
// NAME: utkarsh dhar dwivedi
//PRN:23070126140
//BATCH: AIML B-3
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Student
                    System.out.print("Enter PRN: ");
                    String prn = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter DOB (DD/MM/YYYY): ");
                    String dob = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    Student student = new Student(prn, name, dob, marks);
                    manager.addStudent(student);
                    break;

                case 2: // Display All
                    manager.displayStudents();
                    break;

                case 3: // Search by PRN
                    System.out.print("Enter PRN to search: ");
                    String searchPrn = scanner.nextLine();
                    manager.searchByPrn(searchPrn);
                    break;

                case 4: // Search by Name
                    System.out.print("Enter Name to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchByName(searchName);
                    break;

                case 5: // Search by Position
                    System.out.print("Enter position to search: ");
                    int position = scanner.nextInt();
                    manager.searchByPosition(position);
                    break;

                case 6: // Update Student
                    System.out.print("Enter PRN of student to update: ");
                    String updatePrn = scanner.nextLine();
                    System.out.print("Enter new Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new DOB (DD/MM/YYYY): ");
                    String newDob = scanner.nextLine();
                    System.out.print("Enter new Marks: ");
                    double newMarks = scanner.nextDouble();
                    Student updatedStudent = new Student(updatePrn, newName, newDob, newMarks);
                    manager.updateStudent(updatePrn, updatedStudent);
                    break;

                case 7: // Delete Student
                    System.out.print("Enter PRN to delete: ");
                    String deletePrn = scanner.nextLine();
                    manager.deleteStudent(deletePrn);
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}