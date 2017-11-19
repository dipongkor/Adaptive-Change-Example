package adaptive.change.example;

import java.util.ArrayList;

public class DiamondArrayList {
	private ArrayList<String> people;
	private ArrayList<Integer> ages;

	public DiamondArrayList() {
		people = new ArrayList<String>();
		ages = new ArrayList<Integer>();
	}

	public ArrayList<String> getSortedPeople() {
		// Add some people
		people.add("Kihan");
		people.add("Zeba");
		people.add("Dipok");
		people.add("Misu");

		// Sort people
		people.sort(new NameComparator());

		return people;
	}

	public ArrayList<Integer> getSortedAges() {
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
