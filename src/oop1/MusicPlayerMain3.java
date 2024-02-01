package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        // 음악 플레이어 켜기
        turnOn(data, "on");

        // 볼륨 증가
        volumeUp(data, "up");
        volumeUp(data, "up");

        // 볼륨 감소
        volumeUp(data, "down");

        // 플레이어 상태
        showStatus(data);

        // 플레이어 종료
        turnOn(data, "off");
    }

    static void turnOn(MusicPlayerData data, String status) {
        if (status == "on"){
        data.isOn = true;
        System.out.println("음악을 재생합니다.");
        } else if (status == "off") {
            data.isOn = false;
            System.out.println("음악을 종료합니다.");
        }
    }
    static void volumeUp(MusicPlayerData data, String volume) {
        if (volume == "up") {
            data.volume++;
            System.out.println("현재 볼륨: " + data.volume);
        } else if (volume == "down") {
            data.volume--;
            System.out.println("현재 볼륨: " + data.volume);
        }
    }
    static void showStatus(MusicPlayerData data) {
        if (data.isOn) {
            System.out.println("재생 중입니다. \n 현재 볼륨: " + data.volume);
        } else {
            System.out.println("재생이 종료되었습니다.");
        }
    }

}
