//package model;

public class Employee extends User {
    private String employeeId;
    private String employmentType;
    private String role;
    private double salary;
    private String degree;

    public Employee(String firstName, String lastName, String nationalId,
                    String phoneNumber, String email, String address,
                    String postalCode, String password,
                    String employeeId, String employmentType, String role,
                    double salary, String degree) {
        super(firstName, lastName, nationalId, phoneNumber, email, address, postalCode, password);
        this.employeeId = employeeId;
        this.employmentType = employmentType;
        this.role = role;
        this.salary = salary;
        this.degree = degree;
    }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getEmploymentType() { return employmentType; }
    public void setEmploymentType(String employmentType) { this.employmentType = employmentType; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + ", employeeId='" + employeeId + "', role=" + role + "}";
    }
}
