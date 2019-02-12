package com.company;

public class BookApp {

    public static void main(String[] args) {

        Book a = new Book();
        a.setAuthor("Gary Jennings");
        a.setTitle("Aztec");
        a.setDescription("Extraordinary tale of the last days of the greatest native North American civilization.");
        System.out.println(a.getDisplayText());

        Book b = new Book("Gary Jennings", "Aztec Autumn", "Follow up to Aztec," +
                " detailing the native rebellions following the Aztec Empire's collapse and subsequent Spanish rule.");
        System.out.println(b.getDisplayText());


    }
}
