public class VolumeOfEarth 
{
    // Main method: program execution starts here
    public static void main(String[] args) 
    {
        //Assigning the value to variables
        double radiusKiloMeter = 6378;          
        double pi = Math.PI;

        // Volume of sphere = (4/3) * pi * r^3
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKiloMeter, 3);

        // Conversion: 1 km = 0.621371 miles
        double radiusMiles = radiusKiloMeter * 0.621371;
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +" and cubic miles is " + volumeMiles);
    }
}