import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // see notes on line: 24 & 39
        String studentOrEmployeeChoice, facultyOrStaffChoice;

        // ask user for student or employee
        System.out.println("1) to create a Student");
        System.out.println("2) to create an Employee");
        System.out.print("Choice: ");

        studentOrEmployeeChoice = scanner.nextLine(); // 1: student, 2: employee

        // student
        if (studentOrEmployeeChoice.equals("1")) {

            Student student = new Student();
            student.setPersonInfo();
            student.getStudentInfo();
            System.out.println(student.toString());

            // employee
        } else if (studentOrEmployeeChoice.equals("2")) {

            Employee employee = new Employee();
            employee.setPersonInfo();
            employee.setEmployeeInfo();

            System.out.println("1) to create a faculty member");
            System.out.println("2) to create a staff member");
            System.out.print("Choice: ");

            facultyOrStaffChoice = scanner.nextLine(); // 1: faculty, 2: staff
            MyDate date = new MyDate(employee.myDate.getDate());

            // faculty
            if (facultyOrStaffChoice.equals("1")) {

                Faculty faculty = new Faculty(employee.getName(), employee.getAddress(), employee.getPhoneNumber(),
                        employee.getEmail(), employee.getOfficeNumber(), employee.getSalary(), date.getDate());

                faculty.setFacultyInfo(); // faculty
                System.out.println(faculty.toString());

                // staff
            } else if (facultyOrStaffChoice.equals("2")){

                Staff staff = new Staff(employee.getName(), employee.getAddress(), employee.getPhoneNumber(),
                        employee.getEmail(), employee.getOfficeNumber(), employee.getSalary(), date.getDate());

                staff.setStaffInfo();
                System.out.println(staff.toString());

            } else {
                System.out.println("invalid number, must be one or two");
            }

        } else {
            System.out.println("That is not a valid Number");
        }
    }
}
