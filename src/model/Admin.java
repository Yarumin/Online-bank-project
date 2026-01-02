public class Admin extends User {
    private double salary;
    private String degree;

    public Admin(String firstName, String lastName, String nationalId,
                 String phoneNumber, String email, String address,
                 String postalCode, String password,
                 double salary, String degree) {
        super(firstName, lastName, nationalId, phoneNumber, email, address, postalCode, password);
        this.salary = salary;
        this.degree = degree;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + ", salary=" + salary + ", degree='" + degree + "'}";
    }
}
