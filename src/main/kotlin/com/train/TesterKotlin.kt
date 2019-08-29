package com.train.Kotlin

import java.util.*

fun main() {
    val sn = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    val ticket = sn.nextInt()

    println("How many round-trip tickets: ")
    val round_trip_ticket = sn.nextInt()

    val tl = Ticket(ticket, round_trip_ticket)
    tl.print()

}

class Ticket( val ticket: Int, val round_trip_ticket: Int ) {

    fun print() {
        println("Total tickets: " + (ticket + round_trip_ticket) + "\tRound-trip:" + round_trip_ticket + "\tTotal:" + calculate())
    }

    fun calculate() : Int {
        return ticket*1000 + round_trip_ticket*1800
    }


}