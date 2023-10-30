package com.pluralsight;

public class Room {
    int numOfBeds;
    double price;
    boolean occupied, dirty, available;

    public Room(int numOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int getNumberOfBeds() {
        return numOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }
}
