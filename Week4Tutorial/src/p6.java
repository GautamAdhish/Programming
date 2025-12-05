import java.util.Scanner;

public class p6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        switch (marks) {
            case 80:
                System.out.println("Grade A.");
                break;
            case 60:
                System.out.println("Grade B.");
                break;
            case 40:
                System.out.println("Grade C.");
                break;
            default:
                System.out.println("Grade D.");
        }
    }
}
