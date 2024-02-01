package oop1;

public class MusicPlayerObject {
    int volume = 0;
    boolean isOn = false;

    void turnOn(String status) {
        if (status == "on"){
            isOn = true;
            System.out.println("음악을 재생합니다.");
        } else if (status == "off") {
            isOn = false;
            System.out.println("음악을 종료합니다.");
        }
    }
    void volumeUp(String status) {
        if (status == "up") {
            volume++;
            System.out.println("현재 볼륨: " + volume);
        } else if (status == "down") {
            volume--;
            System.out.println("현재 볼륨: " + volume);
        }
    }
    void showStatus() {
        if (isOn) {
            System.out.println("재생 중입니다. \n 현재 볼륨: " + volume);
        } else {
            System.out.println("재생이 종료되었습니다.");
        }
    }
}

