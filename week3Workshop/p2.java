import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b;
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        System.out.print("Enter another number: ");
        b = sc.nextInt();
        System.out.print("The sum is: " + (a + b) + ".\n");
        System.out.print("The difference is: " + (a-b) + ".\n");
        System.out.print("The product is: " + (a*b) + ".\n");
        System.out.print("The quotient is: " + (a/b) + ".\n");
        System.out.print("The remain is: " + (a%b) + ".");
    }
}
