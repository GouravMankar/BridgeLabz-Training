import java.util.Random;

public class StudentScorecard {

    // method to generate random PCM scores
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // physics, chemistry, maths
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 10 + random.nextInt(90); // Physics
            scores[i][1] = 10 + random.nextInt(90); // Chemistry
            scores[i][2] = 10 + random.nextInt(90); // Maths
        }
        return scores;
    }

    // method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // total, average, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Stu\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1)+"\t"+scores[i][0]+"\t"+scores[i][1]+"\t\t"+scores[i][2]+
                               "\t"+results[i][0]+"\t"+results[i][1]+"\t"+results[i][2]+"%");
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5;
        int[][] scores = generateScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
