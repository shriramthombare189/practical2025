import java.util.Scanner;

class FactorialCalculator {

    // Custom method to calculate factorial
    static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }

        sc.close();
    }
}