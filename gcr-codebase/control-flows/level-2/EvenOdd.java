import java.util.Scanner;
    public class EvenOdd{
        public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
   
        //taking inputs from the user
        System.out.println("Enter the number : ");
        number = sc.nextInt();
        
        //calculating and printing the even and odd numbers
        if(number<0){
            System.out.println("It is an invalid input.");
            return;
        }
        else{
            for(int i=1; i<=number; i++)
            {
               if(i%2 == 0){
                   System.out.println(i + " is an even number.");
               }else{
                   System.out.println(i + " is an odd number.");
               }
            }
        }

       sc.close();
    }
}