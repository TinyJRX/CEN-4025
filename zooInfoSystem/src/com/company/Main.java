package com.company;

public class Main {

    int selection;

    public static void main(String[] args) {
    ticketInvoice();
    membershipInvoice();
    donationInvoice();
    conservationProgram();
    newsFeed();
    animalDatabase();
    }
    //Ticket Invoice
    public static void ticketInvoice(){
        System.out.println("TICKET INVOICE\n\nTicket Price:\nEntry Date:\nTransation#:\n ");

    }
    // Membership Invoice
    public static void membershipInvoice(){
        System.out.println("MEMBERSHIP INVOICE\n\nMembership Owner:\nMembership Tier:\nMembership Price:\nMembership Quantity:\nMembership Time:\nMembership Transaction#:\n");
    }
    // Donation Invoice
    public static void donationInvoice(){
        System.out.println("DONATION INVOICE\n\nDonors Name:\nDonation Amount:\nDonation Tier:\nDonation Transaction#:\n");
    }
    //Event Calendar
    public static void eventCalendar(){
        System.out.println("EVENT CALENDAR\n\nEvent Name:\nEvent Description:\nEvent Price:\n");
    }
    //Conservation Program
    public static void conservationProgram(){
        System.out.println("CONSERVATION PROGRAM\n\nProject Name:\nDescription\nMembers List:\n");
    }
    //News Feed
    public static void newsFeed(){
        System.out.println("NEWS FEED\n\nDate:\nTime:\nTags:\nTitle:\nDescription:\n");
    }
    //Animal Database
    public static void animalDatabase(){
        System.out.println("ANIMAL DATABASE\n\nAnimal Type:\nAnimal Name:\nAnimal Quantity:\nAnimal Location:\n");
    }

}
