package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        //employee testing code
        Employee emp1 = new Employee(123, 10.00, 62, 0, "Erik", "IT");
        Employee emp2 = new Employee(321, 15.00, 24, 0, "Austin", "Kitchen");
        Employee emp3 = new Employee(231, 12.00, 84, 2, "Hayden", "HR");

        System.out.println(emp1.getOvertimeHours());
        System.out.println(emp2.getOvertimeHours());
        System.out.println(emp3.getOvertimeHours());

        System.out.println(emp1.totalPay());
        System.out.println(emp2.totalPay());
        System.out.println(emp3.totalPay());

        //reservation testing code
        Reservation resv1 = new Reservation("king", 0, true, 12, 0 );
        Reservation resv2 = new Reservation("double", 0, false, 5, 0 );
        Reservation resv3 = new Reservation("king", 0, false, 90, 0 );

        System.out.println(resv1.getReservationTotal());
        System.out.println(resv2.getReservationTotal());
        System.out.println(resv3.getReservationTotal());
    }
}
