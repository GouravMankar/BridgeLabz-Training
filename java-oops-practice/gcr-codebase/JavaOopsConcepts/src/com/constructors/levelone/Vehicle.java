package com.constructors.levelone;

//Vehicle class demonstrates static variable usage
class Vehicle {
 String ownerName;
 String vehicleType;
 static double registrationFee = 500.0; // Shared by all vehicles

 Vehicle(String ownerName, String vehicleType) {
     this.ownerName = ownerName;
     this.vehicleType = vehicleType;
 }

//method to display vehicle details
 void displayVehicleDetails() {
     System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Fee: ₹" + registrationFee);
 }

// method for update the registration fee
 static void updateRegistrationFee(double newFee) {
     registrationFee = newFee;
 }

 public static void main(String[] args) {
     Vehicle v1 = new Vehicle("Amit", "Car");
     Vehicle v2 = new Vehicle("Sneha", "Bike");

     v1.displayVehicleDetails();
     v2.displayVehicleDetails();

     Vehicle.updateRegistrationFee(1000);
     v1.displayVehicleDetails();
     v2.displayVehicleDetails();
 }
}
