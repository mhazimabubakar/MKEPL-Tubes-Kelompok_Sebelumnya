import src.main.java.Calculator;

public class Driver {

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		calc.adder(10, 4);
		calc.reset();

		calc.subtract(10, 4);
		calc.reset();

		calc.multiply(10, 4);
		calc.reset();

		calc.divide(10, 4);
		calc.reset();

	}

}
