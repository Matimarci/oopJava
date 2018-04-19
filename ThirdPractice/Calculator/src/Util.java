package iit.uni.miskolc.oop;
import iit.uni.miskolc.oop.exception.*;

public class Util {
	public static void calculate(String operator, Double firstNumber, Double secondNumber) throws DivisionByZeroException {
		System.out.print("Result: ");
		switch (operator) {
		case "-":
			System.out.println(firstNumber - secondNumber);
			break;
		case "+":
			System.out.println(firstNumber + secondNumber);
			break;
		case "/":
			if (!secondNumber.equals(0.0))
				System.out.println(firstNumber / secondNumber);
			else
				throw new DivisionByZeroException("cannot divide by zero");
			break;
		case "*":
			System.out.println(firstNumber * secondNumber);
			break;

		default:
			throw new IllegalArgumentException("unknown operator");			
		}

	}

}