import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l, h, b;
        System.out.print("Enter the length of your wall: ");
        l = sc.nextDouble();
        System.out.print("Enter the breadth of your wall: ");
        b = sc.nextDouble();
        System.out.print("Enter the height of your wall: ");
        h = sc.nextDouble();
        double area;
        area = 2*h*(l+b);
        System.out.println("The area of four walls is: " + area + ".");
    }
}
