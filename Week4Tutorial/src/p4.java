import java.util.Scanner;

public class p4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number");
        double marks = sc.nextDouble();
        if (marks >= 80) {
            System.out.println("Grade A.");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("Grade B.");
        } else if (marks >= 40 && marks < 60) {
            System.out.println("Grade C.");
        } else {
            System.out.println("Grade D.");
        }
    }
}
