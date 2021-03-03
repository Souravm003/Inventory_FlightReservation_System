package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Flight flt = new Flight("1240121", "SpiceJet" , 450, 100);
        flt.incrementBookingCounter();
        System.out.println(flt);
        System.out.println(flt.getFlightDetails());
        System.out.println(flt.checkAvailability());






    }
}
