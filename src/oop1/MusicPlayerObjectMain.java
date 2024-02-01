package oop1;

public class MusicPlayerObjectMain {
    public static void main(String[] args) {
        MusicPlayerObject obj = new MusicPlayerObject();

        // 음악 플레이어 켜기
        obj.turnOn("on");

        // 볼륨 증가
        obj.volumeUp("up");
        obj.volumeUp("up");

        // 볼륨 감소
        obj.volumeUp("down");

        // 플레이어 상태
        obj.showStatus();

        // 플레이어 종료
        obj.turnOn("off");

    }
}
