import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] module = {"Introduction to networks", "Cybersecurity Fundamentals", "Information Systems", "Programming"};
        for (int i = 0; i < 4; i++) {
            System.out.println(module[i]);
        }

        int[] age = new int[5];
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the age: ");
            age[i] = sc.nextInt();
        }
        for (int j = 0; j < 2; j++) {
            System.out.print(age[j]+"\t");
        }

        System.out.println();
        sc.nextLine();
        String[] name = new String[2];
        for (int l = 0; l < 2; l++) {
            System.out.print("Enter the name of person "+ (l+1) +":");
            name[l] = sc.nextLine();
            System.out.println(l);
        }
        for (String k : name) {
            System.out.print(k+"\t");
        }
    }
}