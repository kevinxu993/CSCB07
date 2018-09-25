package lab10;

public class Person {

  // there should be 6 fields
  private final String lastName; // required
  private final String firstName; // required
  private final String dateOfBirth; // required
  private final String phoneNumber; // optional
  private final String address; // optional
  private final String email; // optional

  public static class Builder {

    // required parameters (3)
    private final String lastName; // required
    private final String firstName; // required
    private final String dateOfBirth; // required
    // TODO

    // optional parameters (3)-initialized to default values
    // (of course these should be more reasonable default values)
    // why are these not final?
    private String phoneNumber = "123-DEF-AULT"; // optional
    private String address; // optional
    private String email; // optional
    // TODO

    // Builder constructor with required fields (3)
    public Builder(String s1, String s2, String s3) {
      lastName = s1;
      firstName = s2;
      dateOfBirth = s3;

    }

    // methods below are to change the default values of the optional parameters
    public Builder address(String s4) {
      address = s4;
      return this;
    }

    public Builder phoneNumber(String s5) {
      phoneNumber = s5;
      return this;
    }

    public Builder email(String s6) {
      email = s6;
      return this;
    }

    public Person build() {
      // the inner Builder class can call the
      // private constructor of the outer
      // Person class
      return new Person(this);
    }
  }

  private Person(Builder b) { // private constructor of the outer Person class
    lastName = b.lastName;
    firstName = b.firstName;
    dateOfBirth = b.dateOfBirth;
    phoneNumber = b.phoneNumber;
    address = b.address;
    email = b.email;
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
