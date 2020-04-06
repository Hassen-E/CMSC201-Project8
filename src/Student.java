public class Student extends Person {

    private String classStatus;

    public Student() {}; // default

    // constructor
    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    public void getStudentInfo() {

        System.out.print(this.getName() + "'s class status: ");
                classStatus = scanner.nextLine();
                this.setClassStatus(classStatus);
    }

    @Override
    public String toString() {
        return super.toString() + "Class status: " + getClassStatus() + "\n";

    }

    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }
}
