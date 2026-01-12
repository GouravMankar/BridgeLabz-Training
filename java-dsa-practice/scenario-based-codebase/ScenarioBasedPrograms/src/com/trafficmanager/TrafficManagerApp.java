package com.trafficmanager;

public class TrafficManagerApp {

    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager();

        tm.addToQueue("MH12A101");
        tm.addToQueue("MH12B202");
        tm.addToQueue("MH12C303");

        tm.enterRoundabout();
        tm.enterRoundabout();

        tm.displayRoundabout();
        tm.displayQueue();

        tm.exitRoundabout("MH12A101");
        tm.displayRoundabout();

        tm.enterRoundabout();
        tm.displayRoundabout();
    }
}
