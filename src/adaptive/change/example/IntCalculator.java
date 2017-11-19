package adaptive.change.example;

public class IntCalculator {

	private int a;
	private int b;

	public IntCalculator(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		return this.a + this.b;
	}

	public int subtract() {
		return this.a - this.b;
	}

	public int multiply() {
		return this.a * this.b;
	}

	public int devide() {
		return this.a / this.b;
	}
}
