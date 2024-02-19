import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width;
        double height;

        do {
            System.out.print("Enter the width of the rectangle: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input!");
                System.out.print("Enter the width of the rectangle: ");
                in.next();
            }
            width = in.nextDouble();
            if (width <= 0) {
                System.out.println("Invalid input!");
            }
        } while (width <= 0);

        do {
            System.out.print("Enter the height of the rectangle: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input!");
                System.out.print("Enter the height of the rectangle: ");
                in.next();
            }
            height = in.nextDouble();
            if (height <= 0) {
                System.out.println("Invalid input!");
            }
        } while (height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Length of diagonal: " + diagonal);

        in.close();

    }
}