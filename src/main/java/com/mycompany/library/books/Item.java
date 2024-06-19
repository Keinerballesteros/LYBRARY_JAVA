
package com.mycompany.library.books;

public class Item {
    private int id;
    private String title;
    private String yearPublication;
    private boolean available = true; 

    public Item(int id, String title, String yearPublication) {
        this.id = id;
        this.title = title;
        this.yearPublication = yearPublication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(String yearPublication) {
        this.yearPublication = yearPublication;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    
    public void showInformation(){
        
    }
    
    
}
