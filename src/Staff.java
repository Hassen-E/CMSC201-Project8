public class Staff extends Employee {

    private String title;
    MyDate date = new MyDate(myDate.getDate());

    public Staff(String name, String address, String phoneNumber, String email, String officeNumber, String salary, String date) {
        super(name, address, phoneNumber, email, officeNumber, salary, date);
    }

    public void setStaffInfo() {
        System.out.print("Enter you title: ");
        title = scanner.nextLine();
        setTitle(title);
    }

    @Override
    public String toString() {
        return super.toString() + "Office number: " + getOfficeNumber() + "\n" + "Salary: " + getSalary() + "\n" + "Date hired: " + date.getDate() + "\n"
                + "Title: " + getTitle();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
