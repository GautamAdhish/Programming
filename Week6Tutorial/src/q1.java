import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] module = {"Introduction to networks", "Cybersecurity Fundamentals", "Information Systems", "Programming"};
        for (int i = 0; i < 4; i++) {
            System.out.println(module[i]);
        }

        int[] age = new int[5];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the age: ");
            age[i] = sc.nextInt();
        }
        for (int j = 0; j < 4; j++) {
            System.out.println(age[j]);
        }

        sc.nextLine();
        String[] name = new String[5];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter the name of person "+ (i+1) +":");
            name[i] = sc.nextLine();
        }
        for (int j = 0; j < 4; j++) {
            System.out.println(name[j]);
        }
    }
}