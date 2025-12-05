import java.util.Scanner;
 
/**
 * Write a description of class p9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class p9
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");
    }
}