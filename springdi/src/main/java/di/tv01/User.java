package di.tv01;

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

		// spring 첫 도입 : xml 직접 등록 

		ApplicationContext context = new GenericXmlApplicationContext("spring-tv01.xml");
		
		SamsungTv sTv = context.getBean("samsungTv",SamsungTv.class);
		sTv.turnOn();

	}
}
