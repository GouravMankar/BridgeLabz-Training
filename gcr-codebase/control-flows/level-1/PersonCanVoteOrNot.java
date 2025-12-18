import java.util.Scanner;
public class PersonCanVoteOrNot{
    public static void main(String args[]){
        int age;
        Scanner scanner = new Scanner(System.in);

        //Taking the input from the user
        System.out.println("Enter the age : ");
        age = scanner.nextInt();

        //Checking the age and printing the message
        if(age >= 18){
        System.out.println("The person's age is " + age + " and can vote.");
        }else{
        System.out.println("The person's age is " + age + " and cannot vote.");
        }

        scanner.close();
    }
}