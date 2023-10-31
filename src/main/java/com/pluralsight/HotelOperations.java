package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        //employee testing code
        Employee emp1 = new Employee(123, 10.00, 0, "Erik", "IT");
        Employee emp2 = new Employee(321, 15.00, 24, "Austin", "Kitchen");
        Employee emp3 = new Employee(231, 12.00, 84,  "Hayden", "HR");

        System.out.println(emp1.getOvertimeHours());
        System.out.println(emp2.getOvertimeHours());
        System.out.println(emp3.getOvertimeHours());

        emp1.punchIn(7.5);
        emp1.punchOut();
        emp2.punchIn(2.4);
        emp2.punchOut();
        emp3.punchOut();

        System.out.println(emp1.totalPay());
        System.out.println(emp2.totalPay());
        System.out.println(emp3.totalPay());

        //reservation testing code
        Reservation resv1 = new Reservation("king",true,12);
        Reservation resv2 = new Reservation("double",false,5);
        Reservation resv3 = new Reservation("king",false,90);

        System.out.println(resv1.getReservationTotal());
        System.out.println(resv2.getReservationTotal());
        System.out.println(resv3.getReservationTotal());
    }
}
