public class NumberChecker {

    // method to count digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // method to store digits in array
    public static int[] getDigits(int number) {
        String str = String.valueOf(number);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // method to check duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // method to check armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigits(number);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, power);
        return sum == number;
    }

    // method to find largest and second largest
    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // method to find smallest and second smallest
    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = getDigits(number);

        System.out.println("Duck Number? " + isDuckNumber(number));
        System.out.println("Armstrong Number? " + isArmstrongNumber(number));

        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest = " + largestTwo[0] + ", Second Largest = " + largestTwo[1]);

        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest = " + smallestTwo[0] + ", Second Smallest = " + smallestTwo[1]);
    }
}
