package com.pluralsight;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
public class Employee {
    int employeeID;
    double payRate, hoursWorked, overtimeHours, punchInTime, punchOutTime;
    String name, department;
    public static DecimalFormat df = new DecimalFormat("#.00");

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

    public double getCurrentTimeDecimal(){
        return (LocalDateTime.now().getHour() +(double)LocalDateTime.now().getMinute()/60);
    }
    public void punchIn(double time){
        punchInTime = time;
        punchOutTime = 0;
        System.out.println("You have successfully punched in!");
    }
    public void punchIn(){
        punchInTime = getCurrentTimeDecimal();
        punchOutTime = 0;
    }
    public void punchOut(double time){
        punchOutTime = time;
        if(punchInTime != 0) {
            hoursWorked += (punchOutTime - punchInTime);
            df.format(hoursWorked);
            System.out.println("You have successfully punched out, and your hours have been recorded!");
            punchInTime = 0;
        }
        else{
            System.out.println("Please punch in, and then try again!");
        }
    }
    public void punchOut(){
        if(punchInTime != 0) {
            punchOutTime = getCurrentTimeDecimal();
            hoursWorked += (punchOutTime - punchInTime);
            df.format(hoursWorked);
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
