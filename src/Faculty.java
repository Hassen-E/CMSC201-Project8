public class Faculty extends Employee {

    private String officeHours;
    private String rank;
    MyDate date = new MyDate(myDate.getDate());

    public Faculty(String name, String address, String phoneNumber, String email, String officeNumber, String salary, String date) {
        super(name, address, phoneNumber, email, officeNumber, salary, date);
    }

    public void setFacultyInfo() {
        System.out.print("Enter office hours: ");
        officeHours = scanner.nextLine();
        setOfficeHours(officeHours);

        System.out.print("Enter a rank: ");
        rank = scanner.nextLine();
        setRank(rank);
    }

    @Override
    public String toString() {
        return super.toString() + "Office number: " + getOfficeNumber() + "\n" + "Salary: " + getSalary() + "\n" + "office hours: " + getOfficeHours() + "\n" +
                "Rank: " + getRank() + "\n" + "Date hired: " + date.getDate() + "\n";
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
