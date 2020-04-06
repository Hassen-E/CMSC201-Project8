public class Employee extends Person {

    private String officeNumber;
    private String salary;

    MyDate myDate = new MyDate();

    public Employee() {};

    public Employee(String name, String address, String phoneNumber, String email, String officeNumber, String salary, String dateHired) {
        super(name, address, phoneNumber, email);
        this.officeNumber = officeNumber;
        this.salary = salary;
        myDate.setDate(dateHired);
    }

    public void setEmployeeInfo() {

        System.out.print("Enter your Office number: ");
        officeNumber = scanner.nextLine();
        setOfficeNumber(officeNumber);

        System.out.print("Enter your Salary: $");
        salary = scanner.nextLine();
        setSalary(salary);

        System.out.print("Enter a hire date (mm/dd/yyyy): ");
        String date = scanner.nextLine();
        myDate.setDate(date);
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
