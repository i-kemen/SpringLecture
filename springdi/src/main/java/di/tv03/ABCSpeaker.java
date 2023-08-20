package di.tv03;

public class ABCSpeaker implements Speaker {
	private int volume;
	private String brand;

	public ABCSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("ABC 스피커 () 생성자입니다.");
	}

	public ABCSpeaker(String brand) {
		this.brand = brand;
	}

	@Override
	public void volumeUp() {
		if (volume < 10) {
			volume++;
			System.out.println("ABC 스피커 볼륨 업 : " + volume);
		}
	}

	@Override
	public void volumeDown() {
		if (volume > 0) {
			volume--;
			System.out.println("ABC 스피커 볼륨 업 : " + volume);
		}
	}

	@Override
	public String getBrand() {
		return brand;
	}

}
