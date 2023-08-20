package di.cal01;

public class DivCalculator implements Calculator {
	@Override
	public double calculate(double n1, double n2) {
		if (n2 != 0) {
			double result = n1 / n2;
			// 소수점 둘째 자리까지 반올림
			result = Math.round(result * 100.0) / 100.0;
			return result;
		} else {
			throw new ArithmeticException("Cannot divide by zero.");
		}
	}
}
