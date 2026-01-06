package com.eventease;

public abstract class Event implements ISchedulable {
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;
    protected double baseCost;

    private static int idCounter = 100;

    public Event(String eventName, String location, String date, int attendees, double baseCost) {
        this.eventId = ++idCounter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.baseCost = baseCost;
    }

    public int getEventId() {
        return eventId;
    }

    public double calculateCost(double servicesCost, double discount) {
        return baseCost + servicesCost - discount;
    }

    public abstract void schedule();
}
