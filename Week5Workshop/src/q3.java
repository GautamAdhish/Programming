public class q3 {
    public static void main (String[] args) {
        int sum = 0;
        int sq;
        int i=1;
        do {
            sq = i*i;
            sum = sum + sq;
            i++;
        } while (i <= 10);
        System.out.println("The sum of the squares of first 10 numbers is "+ sum +".");
    }
}
