package core;

import java.util.*;
import observers.Observer;

public class Room {
    private int id;
    private int maxCapacity;
    private int occupants;
    private boolean booked;
    private long bookingTime;
    private List<Observer> observers;


    private int bookingCount;
    private long totalOccupiedTime;
    private long lastOccupiedStart;

    public Room(int id) {
        this.id = id;
        this.maxCapacity = 0;
        this.occupants = 0;
        this.booked = false;
        this.observers = new ArrayList<>();
        this.bookingCount = 0;
        this.totalOccupiedTime = 0;
        this.lastOccupiedStart = 0;
    }

    public int getId() { return id; }
    public int getOccupants() { return occupants; }
    public int getMaxCapacity() { return maxCapacity; }
    public boolean isBooked() { return booked; }
    public boolean isOccupied() { return occupants >= 2; }
    public long getBookingTime() { return bookingTime; }

    public void attach(Observer o) { observers.add(o); }
    private void notifyObservers() { for (Observer o : observers) o.update(this); }


    public void setCapacity(int cap) {
        if (cap <= 0) {
            System.out.println("Invalid capacity. Please enter a valid positive number.");
            return;
        }
        this.maxCapacity = cap;
        System.out.println("Room " + id + " maximum capacity set to " + cap + ".");
    }


    public void addOccupants(int count) {
        if (count < 0) {
            System.out.println("Invalid occupant count.");
            return;
        }
        this.occupants = count;

        if (this.occupants >= 2) {
            System.out.println("Room " + id + " is now occupied by " + occupants + " persons.");
            lastOccupiedStart = System.currentTimeMillis();
        } else {
            System.out.println("Room " + id + " is now unoccupied.");
            if (lastOccupiedStart != 0) {
                totalOccupiedTime += System.currentTimeMillis() - lastOccupiedStart;
                lastOccupiedStart = 0;
            }
        }
        notifyObservers();
    }

    public void book(String time, int duration) {
        if (booked) {
            System.out.println("Room " + id + " is already booked during this time. Cannot book.");
            return;
        }
        booked = true;
        bookingTime = System.currentTimeMillis();
        bookingCount++;
        System.out.println("Room " + id + " booked from " + time + " for " + duration + " minutes.");
    }

    public void cancelBooking() {
        if (!booked) {
            System.out.println("Room " + id + " is not booked. Cannot cancel booking.");
            return;
        }
        booked = false;
        System.out.println("Booking for Room " + id + " cancelled successfully.");
    }

    public void checkStatus() {
    if (booked && !isOccupied()) {
        long elapsed = (System.currentTimeMillis() - bookingTime) / 1000; 
        if (elapsed > 5) { 
            booked = false;
            System.out.println("Room " + id + " is now unoccupied. Booking released. AC and lights off.");
            occupants = 0;
            notifyObservers();
            Notifier.notifyUser(id, "Your booking has been released (status check).");
        } else {
            System.out.println("Room " + id + " booked but not yet expired.");
        }
    } else if (booked) {
        System.out.println("Room " + id + " is currently booked and occupied.");
    } else {
        System.out.println("Room " + id + " is not booked.");
    }
}

    public void printUsageStats() {
        long totalMinutes = totalOccupiedTime / 60000;
        System.out.println("Room " + id + " usage stats: ");
        System.out.println(" - Booked " + bookingCount + " times");
        System.out.println(" - Total occupied time " + totalMinutes + " minutes");
    }
}
