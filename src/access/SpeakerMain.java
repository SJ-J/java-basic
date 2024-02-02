package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker sp = new Speaker(80);

        sp.volumeUp();
        sp.volumeUp();
        sp.volumeUp();
        sp.volumeDown();

        // 필드에 직접 접근
//        sp.volume = 200;
//        System.out.println( "볼륨: " + sp.volume);
        // java: volume has private access in access.Speaker

    }
}
