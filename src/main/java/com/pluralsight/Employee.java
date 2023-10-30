package com.pluralsight;

public class Employee {
    int employeeID;
    double payRate, hoursWorked, overtimeHours;
    String name, department;

    public Employee(int employeeID, double payRate, double hoursWorked, String name, String department) {
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
    public double totalPay(){
        if(overtimeHours > 0){
            return ((hoursWorked * payRate) + (overtimeHours * (payRate * 1.5)));
        }
        else{
            return (hoursWorked * payRate);
        }
    }
}
