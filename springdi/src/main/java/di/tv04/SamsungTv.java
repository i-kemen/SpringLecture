package di.tv04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SamsungTv implements Tv {


	private Speaker leftSpeaker;
	private Speaker rightSpeaker;
	int Volume = 50;


	@Autowired
	public SamsungTv(@Qualifier("abcSpeaker") Speaker leftSpeaker, @Qualifier("xyzSpeaker") Speaker rightSpeaker) {
	    this.leftSpeaker = leftSpeaker;
	    this.rightSpeaker = rightSpeaker;
	}

	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성 ON");

	}

	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성 OFF");
	}

	public void volumeUp() {
		// TODO Auto-generated method stub
		leftSpeaker.volumeUp();
		rightSpeaker.volumeUp();
	}

	public void volumeDown() {
		// TODO Auto-generated method stub
		leftSpeaker.volumeDown();
		rightSpeaker.volumeDown();
	}

	
	public void printSpeakerBrand() {
		System.out.println("Left Speaker Brand: " + leftSpeaker.getBrand());
		System.out.println("Right Speaker Brand: " + rightSpeaker.getBrand());
	}
}