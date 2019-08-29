package com.train;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {


        Scanner sn = new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int ticket = sn.nextInt();

        System.out.println("How many round-trip tickets: ");
        int round_trip_ticket = sn.nextInt();

        Ticket tl = new Ticket(ticket, round_trip_ticket) ;
        tl.print() ;
    }
}
