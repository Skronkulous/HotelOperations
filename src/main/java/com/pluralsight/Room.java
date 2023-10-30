package com.pluralsight;

public class Room {
    int numOfBeds;
    double price;
    boolean occupied, dirty, available;

    public Room(int numOfBeds, double price, boolean occupied, boolean dirty) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        if(dirty == false && occupied == false){
            this.available = true;
        }
        else{
            this.available = false;
        }
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
    public void cleanRoom(){
        dirty = false;
        if(occupied == false){
            available = true;
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkIn(){
        occupied = true;
        dirty = true;
        available = false;
    }

    public void checkOut(){
        occupied = false;
        dirty = true;
        available = false;
    }
}
