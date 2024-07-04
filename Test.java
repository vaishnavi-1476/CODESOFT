package task_fifth;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    String grade = scanner.next();
                   
                    Student student = new Student(name, rollNumber, grade);
                    sms.addStudent(student);
                    
                    break;
                case 2:
                    System.out.print("Enter roll number of the student to remove: ");
                    int rollNo = scanner.nextInt();
                    sms.removeStudent(rollNo);
                    break;
                case 3:
                    System.out.print("Enter roll number of the student to search: ");
                    int searchRollNo = scanner.nextInt();
                    Student foundStudent = sms.searchStudent(searchRollNo);
                    if (foundStudent != null) {
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    sms.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
