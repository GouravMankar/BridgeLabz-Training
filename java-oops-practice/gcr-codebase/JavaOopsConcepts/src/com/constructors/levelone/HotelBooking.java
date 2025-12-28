package com.constructors.levelone;

//HotelBooking demonstrates default, parameterized, and copy constructors
class HotelBooking {
 String guestName;
 String roomType;
 int nights;

 HotelBooking() {
     this.guestName = "Guest";
     this.roomType = "Standard";
     this.nights = 1;
 }

 HotelBooking(String guestName, String roomType, int nights) {
     this.guestName = guestName;
     this.roomType = roomType;
     this.nights = nights;
 }

 HotelBooking(HotelBooking other) {
     this.guestName = other.guestName;
     this.roomType = other.roomType;
     this.nights = other.nights;
 }

//method to display booking details
 void displayBooking() {
     System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
 }

 public static void main(String[] args) {
     HotelBooking h1 = new HotelBooking();
     HotelBooking h2 = new HotelBooking("Maya", "Deluxe", 3);
     HotelBooking h3 = new HotelBooking(h2);

     h1.displayBooking();
     h2.displayBooking();
     h3.displayBooking();
 }
}
