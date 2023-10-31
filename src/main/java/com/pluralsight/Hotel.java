package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites, numberOfRooms;
    private int bookedSuites = 0, bookedRooms = 0;
    Hotel(String name, int numberOfSuites, int numberOfRooms){
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }
    Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;

    }
    public boolean bookRoom(int numRoomsWanted, boolean isSuite){
        if(isSuite == true && numRoomsWanted < getAvailableSuites()){
            bookedSuites += numRoomsWanted;
            System.out.println("You have successfully booked " + numRoomsWanted +" suite rooms! Thank you, and we look forward to your stay! ");
            return true;
        }
        else if(isSuite != true && numRoomsWanted < getAvailableRooms()){
            bookedRooms += numRoomsWanted;
            System.out.println("You have successfully booked " + numRoomsWanted +" double rooms! Thank you, and we look forward to your stay! ");
            return true;
        }
        else{
            System.out.println("There is currently not enough space available to book out " + numRoomsWanted + " rooms, we apologize!");
            return false;
        }
    }

    public int getAvailableSuites(){
        return (numberOfSuites - bookedSuites);
    }
    public int getAvailableRooms(){
        return (numberOfSuites - bookedSuites);
    }
}
