import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.print("Enter the radius of your circle: ");
        r = sc.nextDouble();
        double a = 3.14*r*r;
        double c = 2*3.14*r;
        System.out.println("The area is " + a + " and the circumference is " + c + ".");
    }
}
