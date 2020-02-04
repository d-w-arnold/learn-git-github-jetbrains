package com.example.intellij;

public class Main {

    public static void main(String[] args) {

        int ticketCost = 100;
        int money = 120;

        TicketMachine tm = new TicketMachine(ticketCost);

        System.out.println("Hello World!\n");
        System.out.println("Demo with " + TicketMachine.class.getSimpleName() + ".java\n");
        System.out.println("Price of a ticket: " + tm.getPrice());
        System.out.println("Current balance: " + tm.getBalance());

        tm.insertMoney(money);

        System.out.println("Added money: " + money);
        System.out.println("Current balance: " + tm.getBalance()  + "\n");

        tm.printTicket();

        System.out.println("Current balance: " + tm.getBalance());

    }
}
