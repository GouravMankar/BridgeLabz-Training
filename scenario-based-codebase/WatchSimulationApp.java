/* Digital Watch Simulation 
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements */


public class WatchSimulationApp{
    public static void main(String args[]){
        int hour=0;
        int minute=0;
        for(int i=hour; i<24; i++)
        {
            for(int j=minute; j<60; j++)
            {
               System.out.printf("%02d:%02d\n", i, j);
 
             if(i==13 && j==0)
             {
               break;
             }
            }
          if(i==13)
          {
            break;
          }
        }
   }
}