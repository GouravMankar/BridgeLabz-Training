import java.util.Scanner;
public class BonusOfEmployee{
    public static void main(String args[]){
       int bonus = 5, yearsOfService, salary, bonusAmount;
       Scanner scanner = new Scanner(System.in);

       //taking inputs from the user
       System.out.println("Enter the employee salary: ");
       salary = scanner.nextInt();
       System.out.println("Enter the employee's years of service: ");
       yearsOfService = scanner.nextInt();

       //Calculating the Bonus and printing
       if(yearsOfService>5)
       { 
           bonusAmount = (salary/100) * 5;
           System.out.println("The bonus amount is " + bonusAmount); 
       }
       else{
           System.out.println("Bonus is not provided.");          
       }

       scanner.close();
    }
}