public class q5 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        for (int a = 5; a >= 1; a--) {
            for (int k = a; k <= 4; k++){
                System.out.print(" ");
            }
            for (int b = a; b >= 1; b--) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
