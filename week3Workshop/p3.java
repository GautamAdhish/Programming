import java.util.Scanner;

public class p3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b;
        System.out.print("Enter the length: ");
        l = sc.nextInt();
        System.out.print("Enter the breadth: ");
        b = sc.nextInt();
        int peri;
        peri = 2 * (l + b);
        System.out.println("The perimeter is: "+ peri);
    }
}
