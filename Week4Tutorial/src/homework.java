import java.util.Scanner;

public class homework {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int i = 1;
        int count = 0, rem;
        if (num == 1) {
            System.out.println("! is neither prime nor composite.");
        } else if (num == 0) {
            System.out.println("0 is an invalid number.");
        } else {
            while (i <= num) {
                rem = num % i;
                if (rem == 0) {
                    count = count + 1;
                }
                i++;
            }
            if (count == 2) {
                System.out.println("The number is prime.");
            } else {
                System.out.println("The number is composite.");
            }
        }
    }
}
