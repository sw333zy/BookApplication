package com.company;

public class Book {
    private String title = "";
    private String author = "";
    private String description = "";
    private double price = 0;
    private boolean isInStock = false;

    //constructor
    public Book(){
        System.out.println("This is the book constructor");
    }

    //overloaded constructor (takes arguments)
    public Book(String title, String author, String description){
        System.out.println("This is the 'overloaded book' construction");
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setInStock(boolean isInStock){
        this.isInStock = isInStock;
    }

    public String getDisplayText(){
        return "Author: " + getAuthor() + "\n Title: " + getTitle() + "\n Description: " + getDescription() + "\n Price: " + getPrice();
    }
}
