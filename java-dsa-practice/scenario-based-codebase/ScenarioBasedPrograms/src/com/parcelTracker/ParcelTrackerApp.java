package com.parcelTracker;

public class ParcelTrackerApp {
    public static void main(String[] args) {

        Checkpoint tracker = new Checkpoint();

        tracker.addStageAtEnd("OrderConfirmed");
        tracker.addStageAtEnd("Packed");
        tracker.addStageAtEnd("Shipped");
        tracker.addStageAtEnd("In Transit");
        tracker.addStageAtEnd("Out For Delivery");
        tracker.addStageAtEnd("Delivered");

        tracker.trackParcel();

        System.out.println("\nAdding customs clearance checkpoint...");
        tracker.addCheckpointAfter("Shipped", "Customs Clearance");

        tracker.trackParcel();

        tracker.checkParcelStatus();
    }
}

