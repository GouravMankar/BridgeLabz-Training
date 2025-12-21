public class NumberCheckerDivisors {

    // method to find sum of proper divisors
    public static int sumOfDivisors(int number) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }

    // method to check perfect number
    public static boolean isPerfect(int number) {
        return sumOfDivisors(number) == number;
    }

    // method to check abundant number
    public static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }

    // method to check deficient number
    public static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }

    // method to check strong number
    public static boolean isStrong(int number) {
        int sum = 0, temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // helper factorial method
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int number = 28;
        System.out.println("Perfect? " + isPerfect(number));
        System.out.println("Abundant? " + isAbundant(number));
        System.out.println("Deficient? " + isDeficient(number));
        System.out.println("Strong? " + isStrong(number));
    }
}
