package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 볼륨입니다.");
        } else {
            volume += 10;
            System.out.println("볼륨 " + volume);
        }
    }void volumeDown() {
        volume -= 10;
        System.out.println("볼륨 " + volume);
    }
}
