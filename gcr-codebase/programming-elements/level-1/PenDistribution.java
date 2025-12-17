public class PenDistribution {
    public static void main(String[] args) {
        //Assigning the value to variables
        int totalPens = 14;
        int students = 3;

        // Calculating the pen per student and and remaining pens
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        //Display the output
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}