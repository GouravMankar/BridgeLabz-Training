package com.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date, int attendees) {
        super(name, location, date, attendees, 15000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled at " + location + " on " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}
