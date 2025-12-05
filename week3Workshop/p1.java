import java.util.Scanner;
/**
 * Write a description of class p1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        
        String check;
        check = (a > b) ? "A is greater than b." : "A is lesser than b.";
        System.out.print(check);
    }
}