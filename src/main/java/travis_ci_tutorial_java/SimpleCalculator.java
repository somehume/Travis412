package travis_ci_tutorial_java;

public class SimpleCalculator {
	
	/**
	 * Adds two numbers, returning the sum
	 * @param a addend
	 * @param b addend
	 * @return sum of the two addends
	 */
	public int add(int a, int b) {
		return a + b;
	}
	
	
	/**
	 * Subtracts two numbers, returning the difference
	 * @param a minuend
	 * @param b subtrahend
	 * @return difference of minuend - subtrahend
	 */
	public int minus(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
}
