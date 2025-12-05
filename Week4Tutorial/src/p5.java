import java.util.Scanner;

public class p5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 16) {
            System.out.println("You are eligible for Citizenship.");
        } else {
            System.out.println("You are not eligible for citizenship.");
        }
    }
}
