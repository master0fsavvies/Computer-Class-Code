/*
      CS282-1913 – Spring 2023
               Lab 6 - Phone Book

               John Nix

               4/8/23

               A phone book which can store individual's first and last names, addresses, and phone numbers.

         */
public class Contact  {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setFirstName(String x) {
        this.firstName = x;
    }

    public void setLastName(String x) {
        this.lastName = x;
    }

    public void setAddress(String x) {
        this.address = x;
    }

    public void setPhoneNumber(String x) {
        this.phoneNumber = x;
    }
}