public abstract class User {
    private String firstName;
    private String lastName;
    private String nationalId;
    private String phoneNumber;
    private String address;
    private String email;
    private String postalCode;
    private String password;

    public void setFirstName(String firstName){
        this.firstName = firstName; // نوع سادشه، توی آینده باید اعتبارسنجی بشه
    }
}

