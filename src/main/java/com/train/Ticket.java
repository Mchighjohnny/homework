package com.train;

public class Ticket {

    int ticket  = 0 ;
    int round_ticket = 0 ;

    public Ticket( int ticket, int round_ticket ) {
        this.ticket = ticket ;
        this.round_ticket = round_ticket ;

    }

    public int calculate() {
        int total_price = ticket*1000 + round_ticket*1800 ;
        return total_price ;
    }

    public void print() {
        System.out.println( "Total tickets: "+ (ticket+round_ticket) + "\tRound-trip:" + round_ticket + "\tTotal:" + calculate());
    }

}
