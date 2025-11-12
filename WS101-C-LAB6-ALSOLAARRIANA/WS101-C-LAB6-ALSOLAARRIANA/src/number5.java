import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }
}

public class number5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangle rect1 = new Rectangle();

        System.out.print("Enter the length of the rectangle: ");
        rect1.length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        rect1.width = input.nextDouble();

        double area = rect1.calculateArea();
        System.out.println("The area of the rectangle is: " + area);

        Rectangle rect2 = new Rectangle();
        rect2.length = 10;
        rect2.width = 5;
        System.out.println("Another rectangle with length 10 and width 5 has area: " + rect2.calculateArea());

        input.close();
    }
}
