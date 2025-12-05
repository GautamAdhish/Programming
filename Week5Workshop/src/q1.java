public class q1 {
    public static void main (String[] args) {
        for(int i =2; i <= 20; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        int j=1;
        while (j <= 20) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();
        int k = 1;
        do {
            System.out.print(k*2 + " ");
            k++;
        } while (k <= 10);
    }
}