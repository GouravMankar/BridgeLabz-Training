import java.util.Random;

public class FootballTeamHeight {

    // method to calculate sum of heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    // method to calculate mean height
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }

    // method to find shortest height
    public static int findShortest(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    // method to find tallest height
    public static int findTallest(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        // taking inputs from the user (random heights)
        Random random = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // 150–250 cm
        }

        // calculating shortest, tallest, and mean
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = calculateMean(heights);

        // displaying the result
        System.out.println("Shortest Height = " + shortest);
        System.out.println("Tallest Height = " + tallest);
        System.out.println("Mean Height = " + mean);
    }
}
