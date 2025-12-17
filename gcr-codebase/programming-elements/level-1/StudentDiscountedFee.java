import java.util.Scanner;
public class StudentDiscountedFee
{
    // Main method: program execution starts here
    public static void main(String args[])
    {
        double fee,discountPrecent;
        Scanner scanner=new Scanner(System.in);

       //Taking kilometers from the user
       System.out.println("Enter the Student fee ");
       fee=scanner.nextInt();
       System.out.println("Enter the University discount rate ");
       discountPrecent=scanner.nextInt();

       //calculating the discount
       double discount = fee*discountPrecent/100;

        System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ (fee-discount));
      //  closing the Scanner 
       scanner.close();
     


    }
}