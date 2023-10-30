package com.pluralsight;

public class Reservation {
    String roomType;
    double price, multiplier;
    boolean isWeekend;
    int numOfNights;

    public Reservation(String roomType, double price, boolean isWeekend, int numOfNights, double multiplier) {
        this.roomType = roomType;
        this.isWeekend = isWeekend;
        this.numOfNights = numOfNights;
        if(this.roomType.equalsIgnoreCase("king")){
            this.price = 139.00;
        }
        else{
            this.price = 124.00;
        }
        if(this.isWeekend == true){
            this.multiplier = 1.1;
        }
        else{
            this.multiplier = 1;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }
    public double getMultiplier(){
        return multiplier;
    }

    public double getReservationTotal(){
        return (numOfNights * multiplier * price);
    }
}
