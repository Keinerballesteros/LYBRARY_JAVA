
package com.mycompany.library.books;


public class Books extends Item implements Loanable{
    
    private String author;
    private int numberPages;
    

    public Books(String author, int numberPages, int id, String title, String yearPublication) {
        super(id, title, yearPublication);
        this.author = author;
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Books{" + "author=" + author + ", numberPages=" + numberPages + '}';
    }
    
    

    @Override
    public void lend() {
       
    }

    @Override
    public void returnInformation() {
        
    }
    
    
}
