package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Flight flt = new Flight("1240121", "SpiceJet" , 450, 100);
        flt.incrementBookingCounter();
        System.out.println(flt);
        System.out.println(flt.getFlightDetails());
        System.out.println(flt.checkAvailability());
        RegularTicket rt = new RegularTicket("124343","West Bengal","Bangalore","2021-03-03T05:31:22.169055 ","2021-03-03T09:31:34.169081 ","43",1200.00f, false,"Coffee");
        System.out.println(rt.checkStatus());
        System.out.println(rt.getFlightDuration());
        System.out.println(rt.getSpecialServices());

        TouristTicket Trt = new TouristTicket("1249089","West Bengal","Chicago","2021-03-02T05:31:34.169081 ","2021-03-03T12:31:34.169081 ","87",18000.00f, false,"127 West Huron at LaSalle", new String[]{"Cloud Gate", "Pritzker children zoo"});
        System.out.println(rt.checkStatus());
        System.out.println(rt.getFlightDuration());
        System.out.println(rt.getSpecialServices());





    }
}
