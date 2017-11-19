package adaptive.change.example;

public class Person {
	public String firstName;
	public String lastName;
	public Integer age;

	public void printDetails() {
		if (firstName != null) {
			System.out.println("First Name: " + firstName);
		} else {
			System.out.println("First name is missing");
		}

		if (lastName != null) {
			System.out.println("Last Name: " + lastName);
		} else {
			System.out.println("Last name is missing");
		}

		if (age != null) {
			System.out.println("Age: " + lastName);
		} else {
			System.out.println("Age is missing");
		}
	}
}
