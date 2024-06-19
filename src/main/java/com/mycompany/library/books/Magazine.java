
package com.mycompany.library.books;


public class Magazine extends Item implements Loanable{
    
    private String number;
    private String publicationMonth;
    
    public Magazine(String number, String publicationMonth, int id, String title, String yearPublication) {
        super(id, title, yearPublication);
        this.number = number;
        this.publicationMonth = publicationMonth;
    }
    
   
    @Override
    public String toString() {
        return "Magazine{" + "number=" + number + ", publicationMonth=" + publicationMonth + '}';
    }

    @Override
    public void lend() {
        
    }

    @Override
    public void returnInformation() {
        
    }
   
}
