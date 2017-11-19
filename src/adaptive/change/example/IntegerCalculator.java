package adaptive.change.example;

public class IntegerCalculator {
	private Integer  a;
	private Integer  b;

	public IntegerCalculator(Integer  a, Integer  b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return this.a.intValue() + this.b.intValue();
	}

	public int subtract() {
		return this.a.intValue() - this.b.intValue();
	}

	public int multiply() {
		return this.a.intValue() * this.b.intValue();
	}

	public int devide() {
		return this.a.intValue() / this.b.intValue();
	}
}
