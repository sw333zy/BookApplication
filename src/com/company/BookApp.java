package com.company;

import java.util.Scanner;

public class BookApp {
    static Scanner keyboard = new Scanner(System.in);
    static int userNumInput = 0;
    static String userStockInput = "";

    public static void main(String[] args) {

        Book a = new Book();
        a.setAuthor("Gary Jennings");
        a.setTitle("Aztec");
        a.setDescription("Extraordinary tale of the last days of the greatest native North American civilization.");
        System.out.println(a.getDisplayText());

        Book b = new Book("Gary Jennings", "Aztec Autumn", "Follow up to Aztec," +
                " detailing the native rebellions following the Aztec Empire's collapse and subsequent Spanish rule.");
        System.out.println(b.getDisplayText());

        Book c = new Book();
        Scanner userStockInput = new Scanner(System.in);
        requestBooks(userStockInput, c);
        if (c.getInStock()){
            System.out.println("$" + c.calcPrice());
        }



    }

    public static void requestBooks(Scanner keyboard, Book c){
        System.out.println("Are there books in stock? (y/n)");
        if(keyboard.next().equals("y")){
            c.setInStock(true);
        } else {
            c.setInStock(false);
            System.out.println("You can only purchase in stock items");
            System.exit(0);
        }

        System.out.println("How many books would you like to request?");
        c.setNumBooks(keyboard.nextInt());
        System.out.println("What is the price of the books?");
        c.setPrice(keyboard.nextDouble());
        System.out.println("Your price is: ");


    }
}
