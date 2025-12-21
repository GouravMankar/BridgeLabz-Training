import java.util.Random;

public class ZaraBonus {

    // method to generate salary and years of service
    public static int[][] generateEmployeeData() {
        Random random = new Random();
        int[][] data = new int[10][2]; // salary, years
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + random.nextInt(90000); // 5-digit salary
            data[i][1] = random.nextInt(11); // years 0–10
        }
        return data;
    }

    // method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[10][2]; // new salary, bonus
        for (int i = 0; i < 10; i++) {
            double bonus = (data[i][1] > 5) ? data[i][0] * 0.05 : data[i][0] * 0.02;
            result[i][0] = data[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    // method to calculate totals
    public static void displayTotals(int[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOldSalary\tYears\tBonus\tNewSalary");
        for (int i = 0; i < 10; i++) {
            totalOld += data[i][0];
            totalNew += result[i][0];
            totalBonus += result[i][1];
            System.out.println((i+1)+"\t"+data[i][0]+"\t\t"+data[i][1]+"\t"+result[i][1]+"\t"+result[i][0]);
        }
        System.out.println("Totals:\t"+totalOld+"\t\t-\t"+totalBonus+"\t"+totalNew);
    }

    public static void main(String[] args) {
        int[][] data = generateEmployeeData();
        double[][] result = calculateBonus(data);
        displayTotals(data, result);
    }
}
