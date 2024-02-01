package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악을 재생합니다.");

        // 볼륨 증가
        volume++;
        System.out.println("현재 볼륨: " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("현재 볼륨: " + volume);

        // 플레이어 상태
        System.out.println("플레이어 상태: ");
        if (isOn) {
            System.out.println("재생 중입니다. \n 현재 볼륨: " + volume);
        } else {
            System.out.println("재생이 종료되었습니다.");
        }

        // 플레이어 종료
        isOn = false;
        System.out.println("음악을 종료합니다.");

    }
}
