package com.pluralsight;

import java.time.LocalDateTime;
public class Employee {
    int employeeID;
    double payRate, hoursWorked, overtimeHours;
    String name, department;
    double punchInTime, punchOutTime;

    public Employee(int employeeID, double payRate, double hoursWorked, String name, String department) {
        this.punchInTime = punchInTime;
        this.punchOutTime = punchOutTime;
        this.employeeID = employeeID;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.name = name;
        this.department = department;
        if(hoursWorked > 40){
            this.overtimeHours = hoursWorked - 40;
        }
        else{
            this.overtimeHours = 0.00;
        }
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getOvertimeHours(){
       return overtimeHours;
    }

    public void punchIn(double time){
        //String punchInDateTime = String.valueOf(LocalDateTime.now());
        //String[] time = punchInDateTime.split("T");
        //String[] time2 = time[1].split("\\:");
        //punchInTime = time2[0] + ":" + time2[1];
        //punchOutTime = "null";
        punchInTime = time;
        System.out.println("You have successfully punched in!");
    }
    public void punchOut(double time){
        //String punchOutDateTime = String.valueOf(LocalDateTime.now());
        //String[] time = punchOutDateTime.split("T");
        //String[] time2 = time[1].split("\\:");
        //punchOutTime = time2[0] + ":" + time2[1];
        //punchInTime = "null";
        punchOutTime = time;
        if(punchInTime != 0) {
            hoursWorked += (punchOutTime - punchInTime);
            System.out.println("You have successfully punched out, and your hours have been recorded!");
            punchInTime = 0;
        }
        else{
            System.out.println("Please punch in, and then try again!");
        }
    }
    public double totalPay(){
        if(overtimeHours > 0){
            return ((hoursWorked * payRate) + (overtimeHours * (payRate * 1.5)));
        }
        else{
            return (hoursWorked * payRate);
        }
    }
}
