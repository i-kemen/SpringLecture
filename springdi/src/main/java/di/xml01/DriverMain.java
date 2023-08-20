package di.xml01;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import basic.Hello;

public class DriverMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("spring-xml01.xml");

		// 1. 생성자 주입
		// Car c1 = new Car(new HankookTire);
		Car localCar = (Car) context.getBean("car");
		localCar.printTireBrnad();

		Car car5 = (Car) context.getBean("car5");
		List<String> list = car5.getDriver();
		for (String string : list) {
			System.out.println(string);
		}

		Car car6 = (Car) context.getBean("car6");
		Map<String, String> map = car6.getLocation();
		for (String key : map.keySet()) {
			String value = (String)map.get(key);
			System.out.println(key + " : " + value);
		}
		
	}
}
