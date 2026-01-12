package com.trainCompanion;

public class TrainCompanionApp {

    public static void main(String[] args) {

        TrainCompanion obj = new TrainCompanion();

        obj.addCompartment("Wifi");
        obj.addCompartment("Pantry");
        obj.addCompartment("Waiting Room");
        obj.addCompartment("Ticket Counter");

        obj.display();

        obj.moveAhead();
        obj.moveAhead();

        obj.moveBackward();

        obj.showAdjacentCompartment();

        obj.removeCompartment("Pantry");
        obj.display();
        obj.addCompartment("Pantry");
        obj.display();
    }
}
