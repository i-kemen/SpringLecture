package di.tv05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("xyzSpeaker")
public class XYZSpeaker implements Speaker {
	private int volume;
    private String brand;

    @Autowired
    public XYZSpeaker() {
        this.brand = "XYZ"; // 브랜드를 하드코딩하거나 프로퍼티 파일 등을 통해 가져올 수 있습니다.
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
