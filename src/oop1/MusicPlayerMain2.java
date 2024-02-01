package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악을 재생합니다.");

        // 볼륨 증가
        data.volume++;
        System.out.println("현재 볼륨: " + data.volume);

        // 볼륨 감소
        data.volume--;
        System.out.println("현재 볼륨: " + data.volume);

        // 플레이어 상태
        System.out.println("플레이어 상태: ");
        if (data.isOn) {
            System.out.println("재생 중입니다. \n 현재 볼륨: " + data.volume);
        } else {
            System.out.println("재생이 종료되었습니다.");
        }

        // 플레이어 종료
        data.isOn = false;
        System.out.println("음악을 종료합니다.");

    }
}
