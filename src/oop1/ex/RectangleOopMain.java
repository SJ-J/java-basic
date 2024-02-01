package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rt = new Rectangle();

        rt.width = 10;
        rt.height = 5;

        rt.calculateArea();
        rt.calculatePerimeter();
        rt.isSquare();
    }
}
