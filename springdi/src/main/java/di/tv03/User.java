package di.tv03;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class User {

	public static void main(String[] args) {
//		Speaker leftSpeakerSamsung = new ABCSpeaker("ABC");
//		Speaker rightSpeakerSamsung = new XYZSpeaker("XYZ");
//		SamsungTv samsungTV = new SamsungTv(leftSpeakerSamsung, rightSpeakerSamsung);
//
//		Speaker leftSpeakerLG = new XYZSpeaker("XYZ");
//		Speaker rightSpeakerLG = new ABCSpeaker("ABC");
//		LgTv lgTV = new LgTv(leftSpeakerLG, rightSpeakerLG);
//
//		// 삼성 TV 사용
//		samsungTV.turnOn();
//		samsungTV.volumeUp();
//		samsungTV.volumeDown();
//		samsungTV.printSpeakerBrand();
//		samsungTV.turnOff();
//
//		System.out.println("--------------------");
//
//		// LG TV 사용
//		lgTV.turnOn();
//		lgTV.volumeUp();
//		lgTV.volumeDown();
//		lgTV.printSpeakerBrand();
//		lgTV.turnOff();

		// spring : getter setter야

		ApplicationContext context = new GenericXmlApplicationContext("spring-tv03.xml");
		System.out.println("Spring context initialized with beans: " + Arrays.toString(context.getBeanDefinitionNames()));

		
		SamsungTv sTv = context.getBean("samsungTv",SamsungTv.class);
		System.out.println(sTv.toString());

	}
}
