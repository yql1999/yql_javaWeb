package com.model;

public class BookBean {
    private String bookid = "";
    private String title = "";
    private String author = "";
    private String publisher = "";
    private double price = 0.0;

    public BookBean(){}
    public BookBean(String bookId, String author, 
                       String title, String publisher , double price) {
        this.bookid = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
this.price = price;
    }
    public String getBookid() { return this.bookid; }
    public String getTitle() { return title; }
    public String getAuthor() { return this.author; }
    public String getPublisher () { return publisher; }
    public double getPrice() { return price; }
    
    public void setBookid(String bookid){ this.bookid=bookid;	}
    public void setTitle(String title){this.title=title;	}
    public void setAuthor(String author){ this. author = author;	}
public void setPublisher (String publisher){ this.publisher = publisher;}
    public void setPrice(double price){this.price=price;	}
}
