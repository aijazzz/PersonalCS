package itc.oop.schoolmgmt;

import java.util.Scanner;

public class SchoolManagementSystemPro {
	
	public static int menu() {
		int command = 0;
		System.out.println("Enter your command,\n");
		System.out.println("To add a student: enter 1\n");
		System.out.println("To add a course: enter 2\n");
		System.out.println("To add a teacher: enter 3\n");
		System.out.println("To print list of students: enter 4\n");
		System.out.println("To exit: enter 0\n");
		Scanner scanner = new Scanner(System.in);
		command = scanner.nextInt();
		return command;
	}

	public static void addAStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter student's name: "); 
		String name = scanner.nextLine();
		System.out.println("\nEnter student's roll number: "); 
		int number = scanner.nextInt();
		
		School.admitStudent(new Student(name, number));
	}
	
	public static void main(String[] args) {	
		int command = menu();
		while (command != 0) {
			if (command == 1) {
				addAStudent();
			} else if (command == 2) {
//				addACourse();
			} else if (command == 3) {
//				addATeacher();
			} else if (command == 4) {
				School.printStudentList();
			}
			command = menu();
		}
	}

}
