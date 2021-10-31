//Christopher Hindle
//Homework 3
//Class: CEN 4025
//Date: October 31, 2021

import java.util.*;

class Main {
    public void displayMenu() {
        System.out.println("Please choose from the Categories listed below:\n\n");
        System.out.println("1. Ticket Invoice\n2. Membership Invoice\n3. Donation Invoice\n4. Event Calendar\n5. Conservation Program\n6. News Feed\n7. Animal Database\n");
        System.out.print("Selection: ");
    }

    public void category() {
        System.out.println("\nChoose a new category or quit program?");
        System.out.println("To choose a new category enter 9.");
        System.out.println("To close program enter 0.");

        Scanner scan = new Scanner(System.in);

        switch (scan.nextInt()) {
            case 0:
                System.out.println ("Program closed");
                break;

            case 9:
                System.out.println ("Please proceed.");
                new Main();
                break;

            default:
                System.err.println ( "Not a valid option" );
                break;
        }
    }



    public Main()
    {
        Scanner in = new Scanner(System.in);
        displayMenu();

        switch (in.nextInt())
        {
            case 1:
                System.out.println ( "Ticket Invoice:\n\nTicket Price:\nTicket Quantity:\nEntry Date: mm/dd/yyyy\nTransaction Number: ######" );
                category();
                break;

            case 2:
                System.out.println ( "Membership Invoice:\n\nName:\nMembership Tier:\nMembership Price:\nMembership Quantity:\nMembership Duration: mm/dd/yyyy - mm/dd/yyyy\nTransaction Number: ######" );
                category();
                break;

            case 3:
                System.out.println ( "Donation Invoice:\n\nName:\nDonation Amount:\nDonation Tier: " );
                category();
                break;

            case 4:
                System.out.println ( "Event Calendar:\n\nEvent Name:\nEvent Description:\nEvent Price:\nEvent Date: mm/dd/yyyy\nTransaction Number: ######" );
                category();
                break;
            case 5:
                System.out.println ( "Conservation Program:\n\nConservation Program Name:\nConservation Description:\nConservation Members:" );
                category();
                break;
            case 6:
                System.out.println ( "News Feed:\n\nDate: mm/dd/yyyy\nTime: hh/mm AM/PM\nTags:\nTitle:\nDescription:" );
                category();
                break;
            case 7 :
                //System.out.println ( "Animal Database:\n\nAnimal Type:\nAnimal Name:\nAnimal Quantity:\nAnimal Location:" );
                catAnimalDatabase();
                break;

            default:
                System.err.println ( "Not a valid option" );
                break;
        }
    }

    public void catAnimalDatabase(){
        System.out.println("\nChoose an animal category: 10-19 ");

        Scanner aniScan = new Scanner(System.in);

        switch (aniScan.nextInt()){
            case 10:
                System.out.println("Animal Type: Mammal\nAnimal Name: Chimpanzee\nAnimal Quantity: ##\nAnimal Location: Exhibit A");
                category();
                break;
            case 11:
                System.out.println("Animal Type: Mammal\nAnimal Name: Black Bear\nAnimal Quantity: ##\nAnimal Location: Exhibit B");
                category();
                break;
            case 12:
                System.out.println("Animal Type: Mammal\nAnimal Name: Lion\nAnimal Quantity: ##\nAnimal Location: Exhibit C");
                category();
                break;
            case 13:
                System.out.println("Animal Type: Mammal\nAnimal Name: Elephant\nAnimal Quantity: ##\nAnimal Location: Exhibit D");
                category();
                break;
            case 14:
                System.out.println("Animal Type: Mammal\nAnimal Name: Giraffe\nAnimal Quantity: ##\nAnimal Location: Exhibit E");
                category();
                break;
            case 15:
                System.out.println("Animal Type: Bird\nAnimal Name: Ostrich\nAnimal Quantity: ##\nAnimal Location: Exhibit F");
                category();
                break;
            case 16:
                System.out.println("Animal Type: Bird\nAnimal Name:Peacock\nAnimal Quantity: ##\nAnimal Location: Exhibit G");
                category();
                break;
            case 17:
                System.out.println("Animal Type: Bird\nAnimal Name: Bald Eagle\nAnimal Quantity: ##\nAnimal Location: Exhibit H");
                category();
                break;
            case 18:
                System.out.println("Animal Type: Reptile\nAnimal Name: Chameleon\nAnimal Quantity: ##\nAnimal Location: Exhibit I");
                category();
                break;
            case 19:
                System.out.println("Animal Type: Reptile\nAnimal Name: Crocodile\nAnimal Quantity: ##\nAnimal Location: Exhibit J");
                category();
                break;
            default:
                System.err.println("Not a valid option");
                break;
        }
    }

    public static void main (String[]args)
    {
        new Main();
    }
}