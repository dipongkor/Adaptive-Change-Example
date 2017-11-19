package adaptive.change.example;

public class Employee extends Person {
	public String employeeId;

	@Override
	public void printDetails() {
		if (employeeId != null) {
			System.out.println("Employee Id: " + lastName);
		} else {
			System.out.println("Employee Id is missing");
		}
	}
}
