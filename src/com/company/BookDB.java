
package com.company;

public class BookDB extends Book {
    private String SKU = "";
    //creating constructor
    public BookDB(){
        //creating super which is the default
        super("Aztec Blood", "Gary Jennings", "Several hundred years after the fall of the Aztec" +
                " Empire. A young beggar boy, whose blood runs that of both Spanish and Aztec royalty, must claim his " +
                "birthright");
        SKU = "A1692";

    }
    //creating overloaded constructor and setting properties
    public BookDB(String SKU){
        this.SKU = SKU;
        switch (this.SKU){
            case "JAVA1001":
                setOverloadDB("Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);
                break;
            case "JAVA1002":
                setOverloadDB("Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);
                break;
            case "Orcl1003":
                setOverloadDB("OCP: Oracle Certified Professional Java SE", "Jeanna Boyarsky", "Everything you need to know in one place", 45.00);
                break;
            case "PYTHON1004":
                setOverloadDB("Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50);
                break;
            case "ZOMBIE1005":
                setOverloadDB("The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50);
                break;
            case "RASP1006":
                setOverloadDB("Raspberry Pi Projects for the Evil Genius", "Donald Norris", " \tA dozen fiendishly fun projects for the Raspberry Pi!", 14.75);
                break;
            default:
                break;
        }

    }

    public void setSKU(String SKU){
        this.SKU = SKU;
    }

    public String getSKU(){
        return this.SKU;
    }

    //Here all properties needed to be set in for the overloaded constructor above with the switch statement
    public void setOverloadDB(String title, String author, String description, double price){
        setTitle(title);
        setAuthor(author);
        setDescription(description);
        setPrice(price);
    }

    public String getDisplayText(){
        System.out.println("When this prints we print the super and the price");
        return super.getDisplayText() + "Price: " + getPrice();
    }

}