package di.tv04;

public class ABCSpeaker implements Speaker {
	 private int volume;
	    private String brand;

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