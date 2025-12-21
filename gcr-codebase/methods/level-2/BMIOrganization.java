import java.util.Scanner;

public class BMIOrganization {

    // method to calculate BMI for each person
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double heightM = heightCm / 100.0; // convert cm to meters
            double bmi = weight / (heightM * heightM);
            personData[i][2] = bmi;
        }
    }

    // method to determine BMI status
    public static String[] determineStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.5) status[i] = "Underweight";
            else if (bmi <=24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        double[][] personData = new double[10][3]; // weight, height, BMI
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            double height = scanner.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input, enter positive values!");
                i--; // retry for same person
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
        }

        // calculating BMI
        calculateBMI(personData);

        // determining BMI status
        String[] status = determineStatus(personData);

        // displaying the result
        System.out.println("\nPerson\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                              (i + 1),
                              personData[i][0],
                              personData[i][1],
                              personData[i][2],
                              status[i]);
        }

        scanner.close();
    }
}
