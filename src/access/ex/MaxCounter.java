package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count < max) {
            count++;
            System.out.println("현재 count: " + count);
        } else {
            System.out.println("max값(" + max + ")을 초과했습니다.");
        }

    }
}
