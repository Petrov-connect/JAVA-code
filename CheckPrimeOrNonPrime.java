import java.util.Scanner;
//created by J.M.

public class CheckPrimeOrNonPrime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int digit = Integer.parseInt(scan.nextLine());
        for (int i = 2; i <= Math.abs(digit); i++) {
            boolean prime = true;
            int count = 0;
            for (int j = 2; j <= digit; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 1) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println("Prime");
            } else {
                System.out.println("Non Prime");
            }
        }
    }
}
