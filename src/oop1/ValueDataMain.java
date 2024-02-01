package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData vdata = new ValueData();
        add(vdata);
        add(vdata);
        add(vdata);
    }

    static void add(ValueData vdata) {
        vdata.value++;
        System.out.println("value 증가: " + vdata.value);
    }
}
