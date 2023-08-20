package di.tv03;

public class XYZSpeaker implements Speaker {
	private int volume;
    private String brand;

    public XYZSpeaker() {
		// TODO Auto-generated constructor stub
    	System.out.println("XYZ 스피커() 생성자입니다.");
	}
    
    
    public XYZSpeaker(String brand) {
        this.brand = brand;
    }

    @Override
    public void volumeUp() {
        if (volume < 10) {
            volume++;
            System.out.println("XYZ 스피커 볼륨 업 : " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume--;
            System.out.println("XYZ 스피커 볼륨 다운 : " + volume);
        }
    }

    @Override
    public String getBrand() {
        return brand;
    }
	
}
