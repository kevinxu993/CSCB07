package lab10;

public class PersonBadApproach2 {

  private String lastName; // required
  private String firstName; // required
  private String dateOfBirth; // required
  private String address; // optional
  private String phoneNumber; // optional
  private String email; // optional

  public PersonBadApproach2() {}

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String toString() {
    String fname = "First name: " + this.firstName;
    String lname = "Last name: " + this.lastName;
    String address = "Address: " + this.address;
    String dob = "Date of birth: " + this.dateOfBirth;
    String number = "Number: " + this.phoneNumber;
    String email = "Email: " + this.email;
    return fname + "\n" + lname + "\n" + dob + "\n" + address + "\n" + number
        + "\n" + email + "\n";
  }
}
