import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();
        double avg;
        avg = (double) (a+b+c)/3;
        System.out.println("The average of three numbers is: " + avg);
    }
}
