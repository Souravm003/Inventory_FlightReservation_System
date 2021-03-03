package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Ticket regularTicket = new RegularTicket("10943", "West Bengal",
                "Puducherry", "DepartureDateTime", "ArrivalDateTime",
                "16C", 5000, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("90832", "India", "Chicago",
                "DepartureDateTime", "ArrivalDateTIme",
                "13B", 18000, true, null, null,
                "Carlton Inn Midway", new String[]{"Polk Bros Park", "Cloud Gate"});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }


}

