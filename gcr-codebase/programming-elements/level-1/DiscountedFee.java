public class DiscountedFee
{
    // Main method: program execution starts here
    public static void main(String args[])
    {
      //Assigning the value to variables
      int fee = 125000;
      int discountPercent = 10;
      int discount = (fee/100)*discountPercent;
      int discountedAmount = fee - discount;

      //Display the output
      System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedAmount );


    }
}