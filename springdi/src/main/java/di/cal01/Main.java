package di.cal01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("spring-cal01.xml");
		Calculator addCalculator = (Calculator) context.getBean("addCalculator");
		Calculator subCalculator = (Calculator) context.getBean("subCalculator");
		Calculator mulCalculator = (Calculator) context.getBean("mulCalculator");
		Calculator divCalculator = (Calculator) context.getBean("divCalculator");

		double firstNum = 10;
		double secondNum = 3;

		System.out.println("Addition result: " + addCalculator.calculate(firstNum, secondNum));
		System.out.println("Subtraction result: " + subCalculator.calculate(firstNum, secondNum));
		System.out.println("Multiplication result: " + mulCalculator.calculate(firstNum, secondNum));
		System.out.println("Division result: " + divCalculator.calculate(firstNum, secondNum));


	}

}
