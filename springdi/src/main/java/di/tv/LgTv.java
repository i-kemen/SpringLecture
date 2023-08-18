package di.tv;

public class LgTv implements Tv {

	private Speaker leftSpeaker;
	private Speaker rightSpeaker;
	int Volume = 50;

	public LgTv(Speaker leftSpeaker, Speaker rightSpeaker) {
		this.leftSpeaker = leftSpeaker;
		this.rightSpeaker = rightSpeaker;
	}

	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("엘지 ON");

	}

	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("엘지 OFF");
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
