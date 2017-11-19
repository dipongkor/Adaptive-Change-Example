package adaptive.change.example;

import java.util.Comparator;

public class NameComparator implements Comparator{
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return arg0.toString().compareTo(arg1.toString());
	}
}
