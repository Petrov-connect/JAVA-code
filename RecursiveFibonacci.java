import java.util.Scanner;
//created by J.M.

public class RecursiveFibonacci {

    public static long[] fibonacciArray = new long[100];

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sequence number /less then 100/ from the Fibonacci sequence:");
        int n = Integer.parseInt(scan.nextLine());
        while (n<0){
            System.out.println("Enter a positive number:");
            n=Integer.parseInt(scan.nextLine());
        }

        fibonacciArray[0] = 1;
        fibonacciArray[1] = 1;
        System.out.println(Fibonacci(n));
    }

    static long Fibonacci(long n) {
        long fibonacci;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibonacciArray[(int) n] != 0) {
            return fibonacciArray[(int) n];
        } else {
            fibonacci = Fibonacci(n - 1) + Fibonacci(n - 2);
            fibonacciArray[(int) n] = fibonacci;
            return fibonacci;
        }
    }
}
