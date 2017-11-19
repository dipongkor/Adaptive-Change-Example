package adaptive.change.example;

import java.util.ArrayList;
import java.util.Arrays;

public class NormalArrayList {
	private ArrayList people;
	private ArrayList ages;

	public NormalArrayList() {
		people = new ArrayList();
		ages = new ArrayList();
	}

	public ArrayList getSortedPeople() {
		// Add some people
		people.add("Kihan");
		people.add("Zeba");
		people.add("Dipok");
		people.add("Misu");

		// Sort people
		people.sort(new NameComparator());

		return people;
	}

	public ArrayList getSortedAges() {
		// Add age
		ages.add(70);
		ages.add(30);
		ages.add(14);
		ages.add(25);

		// Sort age
		ages.sort(new NameComparator());
		return ages;
	}
}
