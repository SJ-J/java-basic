package oop1.ex;

public class Rectangle {
    int width;
    int height;
    boolean isSquare;

    int calculateArea() {
        int area = width * height;
        System.out.println("넓이: " + area);
        return area;
    }
    int calculatePerimeter() {
        int perimeter = 2 * (width + height);
        System.out.println("둘레 길이: " + perimeter);
        return perimeter;
    }
    boolean isSquare() {
        if (isSquare == true) {
            System.out.println("정사각형입니다.");
        } else {
            System.out.println("정사각형이 아닙니다.");
        }
        return width == height;
    }
}
