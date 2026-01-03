package model;

import service.ValidationService;
public abstract class User {
    private String firstName;
    private String lastName;
    private String nationalId;
    private String phoneNumber;
    private String email;
    private String address;
    private String postalCode;
    private String password;

    public User(String firstName, String lastName, String nationalId,
                String phoneNumber, String email, String address,
                String postalCode, String password) {
        this.firstName = ValidationService.normalizeName(firstName);
        this.lastName = ValidationService.normalizeName(lastName);
        this.nationalId = nationalId;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
        this.password = password;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = ValidationService.normalizeName(firstName); }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = ValidationService.normalizeName(lastName); }

    public String getNationalId() { return nationalId; }
    public void setNationalId(String nationalId) { this.nationalId = nationalId; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
               " | National ID: " + nationalId +
               " | Phone: " + phoneNumber +
               " | Email: " + email;
    }
}

