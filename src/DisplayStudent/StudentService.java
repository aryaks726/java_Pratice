package DisplayStudent;

import java.util.Scanner;

public class StudentService {

    Student[] students = new Student[2];

    public void storeInformation(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {

            Student student = new Student();
            System.out.println("Enter name");
            student.name = sc.nextLine();
            System.out.println("Enter Address");
            student.address = sc.nextLine();

            students[i] = student;

        }
    }

    public void displayInformation(){
        for (int i = 0; i < 2; i++) {
            Student student = students[i];
            System.out.println("=========================");
            System.out.println("Name="+student.name);
            System.out.println("Address="+student.address);
            System.out.println("=========================");
        }
    }
}

