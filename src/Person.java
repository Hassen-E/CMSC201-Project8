import java.util.Scanner;

public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public static Scanner scanner = new Scanner(System.in);

    public Person() {} // default constructor

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setPersonInfo() {

        System.out.print("Enter a name: ");
        name = scanner.nextLine();
        this.setName(name);

        System.out.print(this.getName() + "'s address: ");
        address = scanner.nextLine();
        this.setAddress(address);

        System.out.print(this.getName() + "'s phone number: ");
        phoneNumber = scanner.nextLine();
        this.setPhoneNumber(phoneNumber);

        System.out.print(this.getName() + "'s email: ");
        email = scanner.nextLine();
        this.setEmail(email);

    }

    @Override
    public String toString() {
        return "\n" + "Student: " + getName() + "\n" + "Address: " + getAddress() + "\n" + "Phone number: " + getPhoneNumber()
                + "\n" + "Email: " + getEmail() + "\n";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
