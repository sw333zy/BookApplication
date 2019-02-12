package com.company;

import java.util.Scanner;

public class BookApp {
    static Scanner keyboard = new Scanner(System.in);
    static int userNumInput = 0;
    static String userStockInput = "";

    public static void main(String[] args) {

        //MAKING NEW INSTANCE OF BOOK
        Book a = new Book();
        a.setAuthor("Gary Jennings");
        a.setTitle("Aztec");
        a.setDescription("Extraordinary tale of the last days of the greatest native North American civilization.");
        System.out.println(a.getDisplayText());
        //making new book
        Book b = new Book("Gary Jennings", "Aztec Autumn", "Follow up to Aztec," +
                " detailing the native rebellions following the Aztec Empire's collapse and subsequent Spanish rule.");
        System.out.println(b.getDisplayText());
        //making new book which will get user input then call the method requestbooks. this takes the userstock
        //input and the name of the new book created which is "c".
        Book c = new Book();
        Scanner userStockInput = new Scanner(System.in);
        requestBooks(userStockInput, c);
        if (c.getInStock()){
            System.out.println("$" + c.calcPrice());
        }
        //creating new book and display the sku methods from BookDB
        BookDB d = new BookDB();
        System.out.println(d.getSKU());
        System.out.println(d.getDisplayText());
        //creating a new book and getting book information based on the SKU entered and the switch cases
        //that are located in BookDB
        System.out.println("Enter SKU: ");
        BookDB e = new BookDB(keyboard.nextLine());
        System.out.println(e.getDisplayText());




    }

    //request books method. takes input from keyboard and info from book "c"
    public static void requestBooks(Scanner keyboard, Book c){
        //gets input from user
        System.out.println("Are there books in stock? (y/n)");
        if(keyboard.next().equals("y")){
            c.setInStock(true);
            //if true it continues
        } else {
            c.setInStock(false);
            //else it exits
            System.out.println("You can only purchase in stock items");
            System.exit(0);
        }
        //continues following questions
        System.out.println("How many books would you like to request?");
        //gets user input of the number of books and the price of books from book class
        //specifically numBooks
        c.setNumBooks(keyboard.nextInt());
        System.out.println("What is the price of the books?");
        c.setPrice(keyboard.nextDouble());
        System.out.println("Your price is: ");


    }

}
